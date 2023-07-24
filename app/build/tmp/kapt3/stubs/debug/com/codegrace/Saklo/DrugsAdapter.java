package com.codegrace.Saklo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0019\u001aB#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\u00020\f2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000ej\b\u0012\u0004\u0012\u00020\u0007`\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\f2\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/codegrace/Saklo/DrugsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/codegrace/Saklo/DrugsAdapter$DrugsViewHolder;", "context", "Landroid/content/Context;", "drugsList", "", "Lcom/codegrace/Saklo/DrugsModel;", "listener", "Lcom/codegrace/Saklo/DrugsAdapter$OnItemClickListener;", "(Landroid/content/Context;Ljava/util/List;Lcom/codegrace/Saklo/DrugsAdapter$OnItemClickListener;)V", "addItems", "", "items", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DrugsViewHolder", "OnItemClickListener", "app_debug"})
public final class DrugsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.codegrace.Saklo.DrugsAdapter.DrugsViewHolder> {
    private final android.content.Context context = null;
    private java.util.List<com.codegrace.Saklo.DrugsModel> drugsList;
    private final com.codegrace.Saklo.DrugsAdapter.OnItemClickListener listener = null;
    
    public DrugsAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.util.List<com.codegrace.Saklo.DrugsModel> drugsList, @org.jetbrains.annotations.NotNull
    com.codegrace.Saklo.DrugsAdapter.OnItemClickListener listener) {
        super();
    }
    
    public final void addItems(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.codegrace.Saklo.DrugsModel> items) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.codegrace.Saklo.DrugsAdapter.DrugsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.codegrace.Saklo.DrugsAdapter.DrugsViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0016R\"\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\"\u0010\u0010\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001a"}, d2 = {"Lcom/codegrace/Saklo/DrugsAdapter$DrugsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "view", "Landroid/view/View;", "(Lcom/codegrace/Saklo/DrugsAdapter;Landroid/view/View;)V", "category", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getCategory", "()Landroid/widget/TextView;", "setCategory", "(Landroid/widget/TextView;)V", "nameBrand", "getNameBrand", "setNameBrand", "nameScientific", "getNameScientific", "setNameScientific", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "onClick", "", "v", "app_debug"})
    public final class DrugsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull
        private android.view.View view;
        private android.widget.TextView category;
        private android.widget.TextView nameScientific;
        private android.widget.TextView nameBrand;
        
        public DrugsViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.view.View getView() {
            return null;
        }
        
        public final void setView(@org.jetbrains.annotations.NotNull
        android.view.View p0) {
        }
        
        public final android.widget.TextView getCategory() {
            return null;
        }
        
        public final void setCategory(android.widget.TextView p0) {
        }
        
        public final android.widget.TextView getNameScientific() {
            return null;
        }
        
        public final void setNameScientific(android.widget.TextView p0) {
        }
        
        public final android.widget.TextView getNameBrand() {
            return null;
        }
        
        public final void setNameBrand(android.widget.TextView p0) {
        }
        
        @java.lang.Override
        public void onClick(@org.jetbrains.annotations.Nullable
        android.view.View v) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/codegrace/Saklo/DrugsAdapter$OnItemClickListener;", "", "onItemClick", "", "position", "", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(int position);
    }
}