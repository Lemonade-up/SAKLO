package com.codegrace.Saklo.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u001bj\b\u0012\u0004\u0012\u00020\u000f`\u001cH\u0002J\u0012\u0010\u001d\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006#"}, d2 = {"Lcom/codegrace/Saklo/activities/RemediesActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/codegrace/Saklo/remediesAdapter;", "bottomNav", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "getBottomNav", "()Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "setBottomNav", "(Lcom/google/android/material/bottomnavigation/BottomNavigationView;)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "remediesList", "", "Lcom/codegrace/Saklo/RemediesModel;", "searchView", "Landroidx/appcompat/widget/SearchView;", "sqLiteHelper", "Lcom/codegrace/Saklo/RemediesSQLiteHelper;", "getSqLiteHelper", "()Lcom/codegrace/Saklo/RemediesSQLiteHelper;", "setSqLiteHelper", "(Lcom/codegrace/Saklo/RemediesSQLiteHelper;)V", "changeStatusBarTextColor", "", "getRemedies", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "searchList", "text", "", "app_debug"})
public final class RemediesActivity extends androidx.appcompat.app.AppCompatActivity {
    public com.google.android.material.bottomnavigation.BottomNavigationView bottomNav;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private com.codegrace.Saklo.remediesAdapter adapter;
    public com.codegrace.Saklo.RemediesSQLiteHelper sqLiteHelper;
    private java.util.List<com.codegrace.Saklo.RemediesModel> remediesList;
    private androidx.appcompat.widget.SearchView searchView;
    
    public RemediesActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.material.bottomnavigation.BottomNavigationView getBottomNav() {
        return null;
    }
    
    public final void setBottomNav(@org.jetbrains.annotations.NotNull
    com.google.android.material.bottomnavigation.BottomNavigationView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.codegrace.Saklo.RemediesSQLiteHelper getSqLiteHelper() {
        return null;
    }
    
    public final void setSqLiteHelper(@org.jetbrains.annotations.NotNull
    com.codegrace.Saklo.RemediesSQLiteHelper p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final java.util.ArrayList<com.codegrace.Saklo.RemediesModel> getRemedies() {
        return null;
    }
    
    private final void searchList(java.lang.String text) {
    }
    
    private final void changeStatusBarTextColor() {
    }
}