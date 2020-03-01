package com.ninshu.feudWithFriends.Services.ServiceImpl;

import com.ninshu.feudWithFriends.DAO.DaoInterface.AnswerDao;
import com.ninshu.feudWithFriends.Entities.AnswerList;
import com.ninshu.feudWithFriends.Services.ServiceInterface.AnswerService;
import com.ninshu.feudWithFriends.model.AnswerListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerDao answerDao;

    @Override
    @Transactional
    public AnswerList getAnswerById(int id) {
        return answerDao.getAnswerById(id);
    }

    @Override
    public List<AnswerListVO> getAnswerByQuestionId(int questionId) {
        return answerDao.getAnswerByQuestionId(questionId);
    }

    @Override
    @Transactional
    public List<AnswerList> getAllAnswers() {
        return answerDao.getAllAnswers();
    }

    @Override
    @Transactional
    public int addAnswerList(AnswerList answerList) {
        return answerDao.addAnswerList(answerList);
    }
}
