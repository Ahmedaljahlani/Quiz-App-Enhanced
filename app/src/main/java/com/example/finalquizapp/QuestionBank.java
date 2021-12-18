package com.example.finalquizapp;

import java.util.ArrayList;

public class QuestionBank {

    private static ArrayList<QuestionModel> EnglishQuestions(){

        final ArrayList<QuestionModel> questionModelArrayList=new ArrayList<>();

        questionModelArrayList.add(new QuestionModel("Am I your friend?", "Yes", "No", "Yes"));
        questionModelArrayList.add(new QuestionModel("Is this a good restaurant?", "Yes", "No", "No"));
        questionModelArrayList.add(new QuestionModel("Are these islands Greek?", "Yes", "No", "Yes"));
        questionModelArrayList.add(new QuestionModel("Was his idea interesting?", "Yes", "No", "No"));
        questionModelArrayList.add(new QuestionModel("Were they happy?", "Yes", "No", "Yes"));
        questionModelArrayList.add(new QuestionModel("Am I at the correct location?", "Yes", "No", "No"));
        questionModelArrayList.add(new QuestionModel("Are the keys under the books?", "Yes", "No", "No"));
        questionModelArrayList.add(new QuestionModel("Was his house on an island?", "Yes", "No", "Yes"));
        questionModelArrayList.add(new QuestionModel("Were the demonstrations in the center of town?", "Yes", "No", "No"));

        return questionModelArrayList;
    }
    private static ArrayList<QuestionModel> CalculusQuestions(){

        final ArrayList<QuestionModel> questionModelArrayList=new ArrayList<>();

        questionModelArrayList.add(new QuestionModel("Am I your friend?", "Yes", "No", "Yes"));
        questionModelArrayList.add(new QuestionModel("Is this a good restaurant?", "Yes", "No", "No"));
        questionModelArrayList.add(new QuestionModel("Are these islands Greek?", "Yes", "No", "Yes"));
        questionModelArrayList.add(new QuestionModel("Was his idea interesting?", "Yes", "No", "No"));
        questionModelArrayList.add(new QuestionModel("Were they happy?", "Yes", "No", "Yes"));
        questionModelArrayList.add(new QuestionModel("Am I at the correct location?", "Yes", "No", "No"));
        questionModelArrayList.add(new QuestionModel("Are the keys under the books?", "Yes", "No", "No"));
        questionModelArrayList.add(new QuestionModel("Was his house on an island?", "Yes", "No", "Yes"));
        questionModelArrayList.add(new QuestionModel("Were the demonstrations in the center of town?", "Yes", "No", "No"));

        return questionModelArrayList;
    }
    private static ArrayList<QuestionModel> ArtificialIntelligenceQuestions(){

        final ArrayList<QuestionModel> questionModelArrayList=new ArrayList<>();

        questionModelArrayList.add(new QuestionModel("Am I your friend?", "Yes", "No", "Yes"));
        questionModelArrayList.add(new QuestionModel("Is this a good restaurant?", "Yes", "No", "No"));
        questionModelArrayList.add(new QuestionModel("Are these islands Greek?", "Yes", "No", "Yes"));
        questionModelArrayList.add(new QuestionModel("Was his idea interesting?", "Yes", "No", "No"));
        questionModelArrayList.add(new QuestionModel("Were they happy?", "Yes", "No", "Yes"));
        questionModelArrayList.add(new QuestionModel("Am I at the correct location?", "Yes", "No", "No"));
        questionModelArrayList.add(new QuestionModel("Are the keys under the books?", "Yes", "No", "No"));
        questionModelArrayList.add(new QuestionModel("Was his house on an island?", "Yes", "No", "Yes"));
        questionModelArrayList.add(new QuestionModel("Were the demonstrations in the center of town?", "Yes", "No", "No"));

        return questionModelArrayList;
    }
    private static ArrayList<QuestionModel> NetWorkingQuestions(){

        final ArrayList<QuestionModel> questionModelArrayList=new ArrayList<>();

        questionModelArrayList.add(new QuestionModel("Am I your friend?", "Yes", "No", "Yes"));
        questionModelArrayList.add(new QuestionModel("Is this a good restaurant?", "Yes", "No", "No"));
        questionModelArrayList.add(new QuestionModel("Are these islands Greek?", "Yes", "No", "Yes"));
        questionModelArrayList.add(new QuestionModel("Was his idea interesting?", "Yes", "No", "No"));
        questionModelArrayList.add(new QuestionModel("Were they happy?", "Yes", "No", "Yes"));
        questionModelArrayList.add(new QuestionModel("Am I at the correct location?", "Yes", "No", "No"));
        questionModelArrayList.add(new QuestionModel("Are the keys under the books?", "Yes", "No", "No"));
        questionModelArrayList.add(new QuestionModel("Was his house on an island?", "Yes", "No", "Yes"));
        questionModelArrayList.add(new QuestionModel("Were the demonstrations in the center of town?", "Yes", "No", "No"));

        return questionModelArrayList;
    }

    private static ArrayList<QuestionModel> MachineLearningQuesions(){

        final ArrayList<QuestionModel> questionModelArrayList=new ArrayList<>();

        questionModelArrayList.add(new QuestionModel("Am I your friend?", "Yes", "No", "Yes"));
        questionModelArrayList.add(new QuestionModel("Is this a good restaurant?", "Yes", "No", "No"));
        questionModelArrayList.add(new QuestionModel("Are these islands Greek?", "Yes", "No", "Yes"));
        questionModelArrayList.add(new QuestionModel("Was his idea interesting?", "Yes", "No", "No"));
        questionModelArrayList.add(new QuestionModel("Were they happy?", "Yes", "No", "Yes"));
        questionModelArrayList.add(new QuestionModel("Am I at the correct location?", "Yes", "No", "No"));
        questionModelArrayList.add(new QuestionModel("Are the keys under the books?", "Yes", "No", "No"));
        questionModelArrayList.add(new QuestionModel("Was his house on an island?", "Yes", "No", "Yes"));
        questionModelArrayList.add(new QuestionModel("Were the demonstrations in the center of town?", "Yes", "No", "No"));

        return questionModelArrayList;
    }

    private static ArrayList<QuestionModel> SoftwareEngineeringQuestions(){

        final ArrayList<QuestionModel> questionModelArrayList=new ArrayList<>();

        questionModelArrayList.add(new QuestionModel("Am I your friend?", "Yes", "No", "Yes"));
        questionModelArrayList.add(new QuestionModel("Is this a good restaurant?", "Yes", "No", "No"));
        questionModelArrayList.add(new QuestionModel("Are these islands Greek?", "Yes", "No", "Yes"));
        questionModelArrayList.add(new QuestionModel("Was his idea interesting?", "Yes", "No", "No"));
        questionModelArrayList.add(new QuestionModel("Were they happy?", "Yes", "No", "Yes"));
        questionModelArrayList.add(new QuestionModel("Am I at the correct location?", "Yes", "No", "No"));
        questionModelArrayList.add(new QuestionModel("Are the keys under the books?", "Yes", "No", "No"));
        questionModelArrayList.add(new QuestionModel("Was his house on an island?", "Yes", "No", "Yes"));
        questionModelArrayList.add(new QuestionModel("Were the demonstrations in the center of town?", "Yes", "No", "No"));

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
