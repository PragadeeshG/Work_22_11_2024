create table if not exists app_hosting_servers(
appserver_name varchar(255) not null,
tomcat_version varchar(255) null,
build_version varchar(255) null,
base_folder varchar(255) null,
log_folder varchar(255) null,
provider_name varchar(255) null,
logback_handlers varchar(255) null,
app_config_code Integer null,
appconfig_location varchar(255) null,
encryption_mode varchar(255) null,
server_port varchar(255) null,
constraint app_hosting_servers_pk primary key(appserver_name));