package com.example.finalquizapp;

import java.util.ArrayList;

public class QuestionBank {

    private static ArrayList<QuestionModel> EnglishQuestions(){

        final ArrayList<QuestionModel> questionModelArrayList=new ArrayList<>();

        questionModelArrayList.add(new QuestionModel("Am I your friend?", true));
        questionModelArrayList.add(new QuestionModel("Is this a good restaurant?", false));
        questionModelArrayList.add(new QuestionModel("Are these islands Greek?", true));
        questionModelArrayList.add(new QuestionModel("Was his idea interesting?", false));
        questionModelArrayList.add(new QuestionModel("Were they happy?", true));
        questionModelArrayList.add(new QuestionModel("Am I at the correct location?", false));
        questionModelArrayList.add(new QuestionModel("Are the keys under the books?", false));
        questionModelArrayList.add(new QuestionModel("Was his house on an island?", true));
        questionModelArrayList.add(new QuestionModel("Were the demonstrations in the center of town?", false));
        questionModelArrayList.add(new QuestionModel("The function f(x)=sqrt(x+1)?", true));
        questionModelArrayList.add(new QuestionModel("The product of two positive numbers is NOT positive?", false));

        return questionModelArrayList;
    }
    private static ArrayList<QuestionModel> CalculusQuestions(){

        final ArrayList<QuestionModel> questionModelArrayList=new ArrayList<>();

        questionModelArrayList.add(new QuestionModel("Am I your friend?", true));
        questionModelArrayList.add(new QuestionModel("Is this a good restaurant?", false));
        questionModelArrayList.add(new QuestionModel("Are these islands Greek?", true));
        questionModelArrayList.add(new QuestionModel("Was his idea interesting?", false));
        questionModelArrayList.add(new QuestionModel("Were they happy?", true));
        questionModelArrayList.add(new QuestionModel("Am I at the correct location?", false));
        questionModelArrayList.add(new QuestionModel("Are the keys under the books?", false));
        questionModelArrayList.add(new QuestionModel("Was his house on an island?", true));
        questionModelArrayList.add(new QuestionModel("Were the demonstrations in the center of town?", false));
        questionModelArrayList.add(new QuestionModel("The function f(x)=sqrt(x+1)?", true));
        questionModelArrayList.add(new QuestionModel("The product of two positive numbers is NOT positive?", false));
        return questionModelArrayList;
    }
    private static ArrayList<QuestionModel> ArtificialIntelligenceQuestions(){

        final ArrayList<QuestionModel> questionModelArrayList=new ArrayList<>();

        questionModelArrayList.add(new QuestionModel("Am I your friend?", true));
        questionModelArrayList.add(new QuestionModel("Is this a good restaurant?", false));
        questionModelArrayList.add(new QuestionModel("Are these islands Greek?", true));
        questionModelArrayList.add(new QuestionModel("Was his idea interesting?", false));
        questionModelArrayList.add(new QuestionModel("Were they happy?", true));
        questionModelArrayList.add(new QuestionModel("Am I at the correct location?", false));
        questionModelArrayList.add(new QuestionModel("Are the keys under the books?", false));
        questionModelArrayList.add(new QuestionModel("Was his house on an island?", true));
        questionModelArrayList.add(new QuestionModel("Were the demonstrations in the center of town?", false));
        questionModelArrayList.add(new QuestionModel("The function f(x)=sqrt(x+1)?", true));
        questionModelArrayList.add(new QuestionModel("The product of two positive numbers is NOT positive?", false));

        return questionModelArrayList;
    }
    private static ArrayList<QuestionModel> NetWorkingQuestions(){

        final ArrayList<QuestionModel> questionModelArrayList=new ArrayList<>();

        questionModelArrayList.add(new QuestionModel("Am I your friend?", true));
        questionModelArrayList.add(new QuestionModel("Is this a good restaurant?", false));
        questionModelArrayList.add(new QuestionModel("Are these islands Greek?", true));
        questionModelArrayList.add(new QuestionModel("Was his idea interesting?", false));
        questionModelArrayList.add(new QuestionModel("Were they happy?", true));
        questionModelArrayList.add(new QuestionModel("Am I at the correct location?", false));
        questionModelArrayList.add(new QuestionModel("Are the keys under the books?", false));
        questionModelArrayList.add(new QuestionModel("Was his house on an island?", true));
        questionModelArrayList.add(new QuestionModel("Were the demonstrations in the center of town?", false));
        questionModelArrayList.add(new QuestionModel("The function f(x)=sqrt(x+1)?", true));
        questionModelArrayList.add(new QuestionModel("The product of two positive numbers is NOT positive?", false));

        return questionModelArrayList;
    }

    private static ArrayList<QuestionModel> MachineLearningQuesions(){

        final ArrayList<QuestionModel> questionModelArrayList=new ArrayList<>();

        questionModelArrayList.add(new QuestionModel("Am I your friend?", true));
        questionModelArrayList.add(new QuestionModel("Is this a good restaurant?", false));
        questionModelArrayList.add(new QuestionModel("Are these islands Greek?", true));
        questionModelArrayList.add(new QuestionModel("Was his idea interesting?", false));
        questionModelArrayList.add(new QuestionModel("Were they happy?", true));
        questionModelArrayList.add(new QuestionModel("Am I at the correct location?", false));
        questionModelArrayList.add(new QuestionModel("Are the keys under the books?", false));
        questionModelArrayList.add(new QuestionModel("Was his house on an island?", true));
        questionModelArrayList.add(new QuestionModel("Were the demonstrations in the center of town?", false));
        questionModelArrayList.add(new QuestionModel("The function f(x)=sqrt(x+1)?", true));
        questionModelArrayList.add(new QuestionModel("The product of two positive numbers is NOT positive?", false));

        return questionModelArrayList;
    }

    private static ArrayList<QuestionModel> SoftwareEngineeringQuestions(){

        final ArrayList<QuestionModel> questionModelArrayList=new ArrayList<>();

        questionModelArrayList.add(new QuestionModel("Am I your friend?", true));
        questionModelArrayList.add(new QuestionModel("Is this a good restaurant?", false));
        questionModelArrayList.add(new QuestionModel("Are these islands Greek?", true));
        questionModelArrayList.add(new QuestionModel("Was his idea interesting?", false));
        questionModelArrayList.add(new QuestionModel("Were they happy?", true));
        questionModelArrayList.add(new QuestionModel("Am I at the correct location?", false));
        questionModelArrayList.add(new QuestionModel("Are the keys under the books?", false));
        questionModelArrayList.add(new QuestionModel("Was his house on an island?", true));
        questionModelArrayList.add(new QuestionModel("Were the demonstrations in the center of town?", false));
        questionModelArrayList.add(new QuestionModel("The function f(x)=sqrt(x+1)?", true));
        questionModelArrayList.add(new QuestionModel("The product of two positive numbers is NOT positive?", false));

        return questionModelArrayList;
    }

    public static ArrayList<QuestionModel> getQuestions(String category){
        if (category.equals("English")){
            return EnglishQuestions();
        }else if (category.equals("Calculus")){
            return CalculusQuestions();
        }else if (category.equals("Artificial_Intelligence")){
            return ArtificialIntelligenceQuestions();
        }else if (category.equals("Networking")){
            return NetWorkingQuestions();
        }else if (category.equals("Machine_Learning")){
            return MachineLearningQuesions();
        }
        else if (category.equals("Software_Engineering")){
            return SoftwareEngineeringQuestions();
        }else {
            return getQuestions(category);
        }
    }
}
