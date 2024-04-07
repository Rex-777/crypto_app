// Generated by view binder compiler. Do not edit!
package com.example.crytoapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.crytoapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class TopCurrencyLayoutBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView topCurrencyCardView;

  @NonNull
  public final TextView topCurrencyChangeTextView;

  @NonNull
  public final ConstraintLayout topCurrencyConstraintLayout;

  @NonNull
  public final ImageView topCurrencyImageView;

  @NonNull
  public final TextView topCurrencyNameTextView;

  private TopCurrencyLayoutBinding(@NonNull CardView rootView,
      @NonNull CardView topCurrencyCardView, @NonNull TextView topCurrencyChangeTextView,
      @NonNull ConstraintLayout topCurrencyConstraintLayout,
      @NonNull ImageView topCurrencyImageView, @NonNull TextView topCurrencyNameTextView) {
    this.rootView = rootView;
    this.topCurrencyCardView = topCurrencyCardView;
    this.topCurrencyChangeTextView = topCurrencyChangeTextView;
    this.topCurrencyConstraintLayout = topCurrencyConstraintLayout;
    this.topCurrencyImageView = topCurrencyImageView;
    this.topCurrencyNameTextView = topCurrencyNameTextView;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static TopCurrencyLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TopCurrencyLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.top_currency_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TopCurrencyLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView topCurrencyCardView = (CardView) rootView;

      id = R.id.topCurrencyChangeTextView;
      TextView topCurrencyChangeTextView = ViewBindings.findChildViewById(rootView, id);
      if (topCurrencyChangeTextView == null) {
        break missingId;
      }

      id = R.id.topCurrencyConstraintLayout;
      ConstraintLayout topCurrencyConstraintLayout = ViewBindings.findChildViewById(rootView, id);
      if (topCurrencyConstraintLayout == null) {
        break missingId;
      }

      id = R.id.topCurrencyImageView;
      ImageView topCurrencyImageView = ViewBindings.findChildViewById(rootView, id);
      if (topCurrencyImageView == null) {
        break missingId;
      }

      id = R.id.topCurrencyNameTextView;
      TextView topCurrencyNameTextView = ViewBindings.findChildViewById(rootView, id);
      if (topCurrencyNameTextView == null) {
        break missingId;
      }

      return new TopCurrencyLayoutBinding((CardView) rootView, topCurrencyCardView,
          topCurrencyChangeTextView, topCurrencyConstraintLayout, topCurrencyImageView,
          topCurrencyNameTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}