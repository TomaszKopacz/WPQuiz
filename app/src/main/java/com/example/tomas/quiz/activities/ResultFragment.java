package com.example.tomas.quiz.activities;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.tomas.quiz.R;
import com.example.tomas.quiz.model.Quiz;
import com.example.tomas.quiz.model.Rate;
import com.example.tomas.quiz.presenters.QuizActivityPresenter;
import com.example.tomas.quiz.presenters.ResultFragmentPresenter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 *
 */
public class ResultFragment extends Fragment {

    private ResultFragmentPresenter presenter;

    private int score;
    private String comment;

    @BindView(R.id.score)
    TextView scoreView;

    @BindView(R.id.rate)
    TextView rateView;

    @BindView(R.id.again)
    Button againBtn;

    @BindView(R.id.back)
    Button backBtn;

    public ResultFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_result, container, false);

        // bind views
        ButterKnife.bind(this, view);

        // set content
        setUp();

        return view;
    }

    /**
     * Sets content.
     */
    private void setUp(){

        if (score >= 0 && score <= 100)
            scoreView.append(score + "%");

        if (comment != null)
            rateView.setText(comment);
    }

    /**
     * Sets presenter.
     * @param presenter
     */
    public void setPresenter(ResultFragmentPresenter presenter){
        this.presenter = presenter;
    }

    /**
     * Sets score text.
     * @param score
     */
    public void setScore(int score){
        this.score = score;
    }

    /**
     * Sets comment.
     * @param comment
     */
    public void setComment(String comment){
        this.comment = comment;
    }

    @OnClick(R.id.again)
    public void doQuizAgain(){
        presenter.doQuizAgain();
    }

    @OnClick(R.id.back)
    public void exitQuiz(){
        presenter.exitQuiz();
    }
}
