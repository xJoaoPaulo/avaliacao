use avaliacao;

insert into tb_curso values(null, 'Formação JAVA', 340);
insert into tb_curso values(null, 'Formação PHP', 290);

insert into tb_instrutor values(null, 'Jonas', 130);
insert into tb_instrutor values(null, 'Leonardo', 90);
insert into tb_instrutor values(null, 'Ivo', 90);
insert into tb_instrutor values(null, 'Fabio', 90);
insert into tb_instrutor values(null, 'Andréia', 180);

insert into tb_turma values(null, '2020-08-30', '2020-06-15', 1);
insert into tb_turma values(null, '2020-09-30', '2020-07-20', 2);

insert into tb_aluno values(null, '42709302949', 'Luiz');
insert into tb_aluno values(null, '87840903284', 'Carlos');

insert into tb_turma_aluno values(2, 1);
insert into tb_turma_aluno values(2, 2);

insert into tb_turma_instrutor values(1,1);
insert into tb_turma_instrutor values(1,2);
insert into tb_turma_instrutor values(1,3);
insert into tb_turma_instrutor values(1,4);
insert into tb_turma_instrutor values(2,1);
insert into tb_turma_instrutor values(2,2);
insert into tb_turma_instrutor values(2,3);
insert into tb_turma_instrutor values(2,4);