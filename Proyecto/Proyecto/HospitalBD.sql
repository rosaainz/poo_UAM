create database if not exists hospital;

create TABLE empleados(
        numEmpleado int NOT NULL,
        nombreEmpleado varchar(45),
        edad int,
        sexo varchar(45),
        salario double,
        PRIMARY KEY(numEmpleado)
    );
    
create TABLE medicamentos(
        clave varchar(45) NOT NULL,
        nombreComercial varchar(45),
        sustanciaActiva varchar(45),
        presentacion varchar(45),
        viaAdministracion varchar(45),
        PRIMARY KEY(clave)
    );
    
 create TABLE pacientes(
        NSS varchar(45) NOT NULL,
        nombrePaciente varchar(45),
        diagnostico varchar(45),
        PRIMARY KEY(NSS)
    );   