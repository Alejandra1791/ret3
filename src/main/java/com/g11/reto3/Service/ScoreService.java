package com.g11.reto3.Service;

import com.g11.reto3.Entetities.Score;
import com.g11.reto3.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScoreService {
    @Autowired
    private ScoreRepository scoreRepository;

    public List<Score> getAll(){
        return (List<Score>) scoreRepository.getAll();
    }

    public Optional<Score> getScore(int id){

        return scoreRepository.getScore(id);
    }

    public Score save(Score score){
        if(score.getIdScore()== null){
            return scoreRepository.save(score);
        }else{
            Optional<Score> scoreFound = scoreRepository.getScore(score.getIdScore());
            if(scoreFound.isPresent()){
                return scoreRepository.save(score);
            }else{
                return score;
            }
        }
    }


}