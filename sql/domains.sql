create table domains ( 
  id serial not null, 
  domain varchar(70) not null
);

\copy domains(domain) from '/workspaces/L2-Test-main/data/dominios.txt';