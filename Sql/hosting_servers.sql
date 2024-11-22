create table if not exists hosting_servers(
server_host varchar(255) not null,
server_ip varchar(255) null,
ssh_key varchar(255) null,
global_ssh varchar(255) null,
root_user varchar(255) null,
app_user varchar(255) null,
gpg_key varchar(255) null,
gpg_algo Integer null,
base_folder varchar(255) null,
patch_date varchar(255) null,
patch_version varchar(255) null,
constraint hosting_servers_pk primary key(server_host));