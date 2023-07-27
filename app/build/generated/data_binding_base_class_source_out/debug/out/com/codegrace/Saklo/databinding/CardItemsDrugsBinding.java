// Generated by view binder compiler. Do not edit!
package com.codegrace.Saklo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.codegrace.Saklo.R;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CardItemsDrugsBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView recyclerCard;

  @NonNull
  public final TextView recyclerCategory;

  @NonNull
  public final ShapeableImageView recyclerImage;

  @NonNull
  public final TextView recyclerNameBrand;

  @NonNull
  public final TextView recyclerNameGeneric;

  private CardItemsDrugsBinding(@NonNull CardView rootView, @NonNull CardView recyclerCard,
      @NonNull TextView recyclerCategory, @NonNull ShapeableImageView recyclerImage,
      @NonNull TextView recyclerNameBrand, @NonNull TextView recyclerNameGeneric) {
    this.rootView = rootView;
    this.recyclerCard = recyclerCard;
    this.recyclerCategory = recyclerCategory;
    this.recyclerImage = recyclerImage;
    this.recyclerNameBrand = recyclerNameBrand;
    this.recyclerNameGeneric = recyclerNameGeneric;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static CardItemsDrugsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CardItemsDrugsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.card_items_drugs, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CardItemsDrugsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView recyclerCard = (CardView) rootView;

      id = R.id.recyclerCategory;
      TextView recyclerCategory = ViewBindings.findChildViewById(rootView, id);
      if (recyclerCategory == null) {
        break missingId;
      }

      id = R.id.recyclerImage;
      ShapeableImageView recyclerImage = ViewBindings.findChildViewById(rootView, id);
      if (recyclerImage == null) {
        break missingId;
      }

      id = R.id.recyclerNameBrand;
      TextView recyclerNameBrand = ViewBindings.findChildViewById(rootView, id);
      if (recyclerNameBrand == null) {
        break missingId;
      }

      id = R.id.recyclerNameGeneric;
      TextView recyclerNameGeneric = ViewBindings.findChildViewById(rootView, id);
      if (recyclerNameGeneric == null) {
        break missingId;
      }

      return new CardItemsDrugsBinding((CardView) rootView, recyclerCard, recyclerCategory,
          recyclerImage, recyclerNameBrand, recyclerNameGeneric);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
