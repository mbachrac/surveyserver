package com.ti.surveyserver.repository;

import com.ti.surveyserver.model.answers.SurveyAnswer;
import org.springframework.data.repository.Repository;

import java.math.BigInteger;

public interface SurveyAnswersRepository extends Repository<SurveyAnswer, String> {
    SurveyAnswer save(SurveyAnswer item);
    SurveyAnswer findOneById(Object id);
}
