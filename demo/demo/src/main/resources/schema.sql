DROP TABLE IF EXISTS airlines;  
CREATE TABLE airlines (  
airline_id INT NOT NULL,  
airline VARCHAR(50) NOT NULL,  
src_airport VARCHAR(50) NOT NULL,
src_airport_id INT NOT NULL,
dst_airport VARCHAR(50) NOT NULL,
dst_airport_id INT NOT NULL,
code_share VARCHAR(1) NOT NULL DEFAULT '',
stops INT NOT NULL, 
equipment VARCHAR(50) NOT NULL,
CONSTRAINT airlines_unique UNIQUE (airline_id, src_airport_id, dst_airport_id)
);  