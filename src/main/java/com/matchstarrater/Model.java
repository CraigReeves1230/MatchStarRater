package com.matchstarrater;

public class Model {
    
    boolean factoring_heat;
    
    //Calculate star rating
    public String calculate(float execution, float heat, float action, float story) {
        
        // Determine first if heat is being factored
        if (heat == 99F) {
            factoring_heat = false;
        } else {
            factoring_heat = true;
        }
        
        // Calculate match score
        float score = calculateMatchScore(execution, heat, action, story);
        
        // Convert it to a match star rating
        return convertToStarRating(score);
    }
    
    private float calculateMatchScore(float execution, float heat, float action, float story) {
        
        //This is the return value
        float score;
       
        // Come up with base value first with our base formula
        if (heat != 99F) 
            score = (execution + (heat * 2) + action + (story * 3))/7;
        else
            score = (execution + action + (story * 3))/5;
        
        // Now let's make modifications to the basal value
        score = filterScore(execution, heat, action, story, score);
        
        return score;
    }    
    
    private float filterScore(float execution, float heat, float action, float story, float score) {
        
        // If the execution is poor, punish the performers harshly
        if (execution < 2.0) {score -= 1.5;}
        
        // If execution is exmemplary, reward performers greatly, but only if action is strong
        if (execution >= 4.5 & score >= 3.5) {score += 0.25;}
        
        // If execution is great, reward performers greatly but only if the action is strong
        if (execution >= 4 & action >= 3) {score += 0.25;}
        
        // If the crowd is hot for the match and the story is good, reward match
        // but only if action is strong
        if (factoring_heat) {
             if (heat > 3 & story >= 3.0 & action >= 3.0) {score += 0.25;}
        }
        
        // If the action is better than average and the execution is not, this
        // tells me that it was probably kind of sloppy.
        if (execution <= 2 & action > 2.25) {score -= 0.25;}
        
        // If the execution is very good and the action is too, reward performers
        if (execution > 3.25 & action > 3.25) {score += 0.25;}
        
        // If the heat is incredible and the match is great, reward match generously
        if (factoring_heat) {
            if (heat > 4 & story >= 4 & story >= 3.0) {score += 0.50;}
        }
        
        return score;
    }
    
    private String convertToStarRating(float score) {
        if (score < 0.25) { return "DUD";
    }
        if ((score >= 0.25) & (score < 0.5)) { return "1/4*";
    }
        if ((score >= 0.5) & (score < 0.75)) { return "1/2*";
    }
        if ((score >= 0.75) & (score < 1)) { return "3/4*";
    }
        if ((score >= 1) & (score < 1.25)) { return "*";
    }
        if ((score >= 1.25) & (score < 1.50)) { return "*1/4";
    }
        if ((score >= 1.5) & (score < 1.75)) { return "*1/2";
    }
        if ((score >= 1.75) & (score < 2)) { return "*3/4";
    }
        if ((score >= 2) & (score < 2.25)) { return "**";
    }
        if ((score >= 2.25) & (score < 2.5)) { return "**1/4";
    }
        if ((score >= 2.5) & (score < 2.75)) { return "**1/2";
    }
        if ((score >= 2.75) & (score < 3)) { return "**3/4";
    }
        if ((score >= 3) & (score < 3.25)) { return "***";
    }
        if ((score >= 3.25) & (score < 3.5)) { return "***1/4";
    }
        if ((score >= 3.5) & (score < 3.75)) { return "***1/2";
    }
        if ((score >= 3.75) & (score < 4)) { return "***3/4";
    }
        if ((score >= 4) & (score < 4.25)) { return "****";
    }
        if ((score >= 4.25) & (score < 4.5)) { return "****1/4";
    }
        if ((score >= 4.5) & (score < 4.75)) { return "****1/2";
    }
        if ((score >= 4.75) & (score < 4.90)) { return "****3/4";
    }
        else { return "*****";
    }
}
   
}

