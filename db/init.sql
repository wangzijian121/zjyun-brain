create table auth
(
    id                   int auto_increment
        primary key,
    user_id              int          null comment '用户ID',
    token                varchar(255) null comment 'token',
    expire_time          datetime     null comment '过期时间',
    number_of_connection int          null comment '连接次数'
)
    comment '认证表';

create table brain
(
    id             int auto_increment
        primary key,
    use_id         int null comment '用户ID',
    recall_count   int null comment '回忆次数',
    remember_total int null comment '记忆总数'
)
    comment '大脑';

create table label
(
    id       int auto_increment
        primary key,
    brain_id int          null comment '大脑ID',
    name     varchar(255) null comment '标签名'
)
    comment '标签表';

create table user
(
    id                int auto_increment
        primary key,
    username          varchar(255) null comment '用户名',
    platform          varchar(255) null comment '平台',
    registration_time datetime     null comment '注册时间'
)
    comment '用户表';

