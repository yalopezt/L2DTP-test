create table tlds ( 
  id serial not null, 
  tld varchar(40) not null, 
  cantidad int not null
);

\copy tlds(tld,cantidad) from '/workspaces/L2-Test-main/data/ok.csv' delimiter ',' csv header;

