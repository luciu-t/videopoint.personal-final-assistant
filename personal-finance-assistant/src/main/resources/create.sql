create table if not exists currency_rates (CURRENCY VARCHAR2(3) NOT NULL, RATE_DATE DATE, RATE NUMBER(8,4));
delete currency_rates;
insert into currency_rates (CURRENCY, RATE_DATE, RATE) values ('EUR', '2016-01-24', 4.6612);
commit;