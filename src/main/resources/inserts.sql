INSERT INTO roles (name)
VALUES ('user');
INSERT INTO roles (name)
VALUES ('administrator');

INSERT INTO users (login, password, role_id)
VALUES ('andormi', 'andormi', '1');
INSERT INTO users (login, password, role_id)
VALUES ('anshafs', 'anshafs', '1');
INSERT INTO users (login, password, role_id)
VALUES ('allpowerfullandrew', 'allpowerfullandrew', '1');
INSERT INTO users (login, password, role_id)
VALUES ('browseup', 'browseup', '1');

INSERT INTO questions (question)
VALUES ('question1');
INSERT INTO questions (question)
VALUES ('question2');

INSERT INTO answers (question_id, answer, is_correct)
VALUES ('1', 'answer1', '1');
INSERT INTO answers (question_id, answer, is_correct)
VALUES ('1', 'answer2', '0');
INSERT INTO answers (question_id, answer, is_correct)
VALUES ('2', 'answer1', '1');
INSERT INTO answers (question_id, answer, is_correct)
VALUES ('2', 'answer2', '0');



