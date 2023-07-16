package com.codegrace.Saklo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u001e\u0010\u0013\u001a\u00020\f2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0015j\b\u0012\u0004\u0012\u00020\u0007`\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/codegrace/Saklo/FacilityAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/codegrace/Saklo/FacilityAdapter$MyViewHolder;", "context", "Landroid/content/Context;", "healthFacilityDataList", "", "Lcom/codegrace/Saklo/HealthFacilityData;", "(Landroid/content/Context;Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "searchDataList", "searchList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "MyViewHolder", "app_debug"})
public final class FacilityAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.codegrace.Saklo.FacilityAdapter.MyViewHolder> {
    private final android.content.Context context = null;
    private java.util.List<com.codegrace.Saklo.HealthFacilityData> healthFacilityDataList;
    
    public FacilityAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.util.List<com.codegrace.Saklo.HealthFacilityData> healthFacilityDataList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.codegrace.Saklo.FacilityAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.codegrace.Saklo.FacilityAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void searchDataList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.codegrace.Saklo.HealthFacilityData> searchList) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lcom/codegrace/Saklo/FacilityAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/codegrace/Saklo/FacilityAdapter;Landroid/view/View;)V", "recyclerCard", "Landroidx/cardview/widget/CardView;", "getRecyclerCard", "()Landroidx/cardview/widget/CardView;", "recyclerClassif", "Landroid/widget/TextView;", "getRecyclerClassif", "()Landroid/widget/TextView;", "recyclerLocation", "getRecyclerLocation", "recyclerName", "getRecyclerName", "recyclerType", "getRecyclerType", "app_debug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView recyclerName = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView recyclerType = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView recyclerLocation = null;
        @org.jetbrains.annotations.NotNull
        private final androidx.cardview.widget.CardView recyclerCard = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView recyclerClassif = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getRecyclerName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getRecyclerType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getRecyclerLocation() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.cardview.widget.CardView getRecyclerCard() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getRecyclerClassif() {
            return null;
        }
    }
}