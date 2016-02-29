package com.matchstarrater.model;

public class StarRating {
    private String value;
    
    // constructor
    StarRating(float score) {
            if (score < 0.25) { value = "DUD";
    }
        if ((score >= 0.25) & (score < 0.5)) { value = "1/4*";
    }
        if ((score >= 0.5) & (score < 0.75)) { value = "1/2*";
    }
        if ((score >= 0.75) & (score < 1)) { value = "3/4*";
    }
        if ((score >= 1) & (score < 1.25)) { value = "*";
    }
        if ((score >= 1.25) & (score < 1.50)) { value = "*1/4";
    }
        if ((score >= 1.5) & (score < 1.75)) { value = "*1/2";
    }
        if ((score >= 1.75) & (score < 2)) { value = "*3/4";
    }
        if ((score >= 2) & (score < 2.25)) { value = "**";
    }
        if ((score >= 2.25) & (score < 2.5)) { value = "**1/4";
    }
        if ((score >= 2.5) & (score < 2.75)) { value = "**1/2";
    }
        if ((score >= 2.75) & (score < 3)) { value = "**3/4";
    }
        if ((score >= 3) & (score < 3.25)) { value = "***";
    }
        if ((score >= 3.25) & (score < 3.5)) { value = "***1/4";
    }
        if ((score >= 3.5) & (score < 3.75)) { value = "***1/2";
    }
        if ((score >= 3.75) & (score < 4)) { value = "***3/4";
    }
        if ((score >= 4) & (score < 4.25)) { value = "****";
    }
        if ((score >= 4.25) & (score < 4.5)) { value = "****1/4";
    }
        if ((score >= 4.5) & (score < 4.75)) { value = "****1/2";
    }
        if ((score >= 4.75) & (score < 4.90)) { value = "****3/4";
    }
        else if (score > 4.90) { value = "*****";
    }
    }
    
    public String value() {
        return value;
    }
}