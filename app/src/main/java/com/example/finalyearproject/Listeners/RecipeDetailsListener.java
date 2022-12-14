package com.example.finalyearproject.Listeners;

import com.example.finalyearproject.Models.RecipeDetailsResponse;

public interface RecipeDetailsListener {
    void didFetch(RecipeDetailsResponse response,String message);
    void didError(String message);
}
