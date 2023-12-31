// Generated by view binder compiler. Do not edit!
package com.honeywell.barcodeexample.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.honeywell.barcodeexample.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SettingsScreenBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final TextView amntScan;

  @NonNull
  public final EditText amntScanInput;

  @NonNull
  public final Button backButton;

  @NonNull
  public final CheckBox counter;

  @NonNull
  public final TextView settingsTitle;

  @NonNull
  public final CheckBox sound;

  @NonNull
  public final CheckBox timer;

  private SettingsScreenBinding(@NonNull FrameLayout rootView, @NonNull TextView amntScan,
      @NonNull EditText amntScanInput, @NonNull Button backButton, @NonNull CheckBox counter,
      @NonNull TextView settingsTitle, @NonNull CheckBox sound, @NonNull CheckBox timer) {
    this.rootView = rootView;
    this.amntScan = amntScan;
    this.amntScanInput = amntScanInput;
    this.backButton = backButton;
    this.counter = counter;
    this.settingsTitle = settingsTitle;
    this.sound = sound;
    this.timer = timer;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SettingsScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SettingsScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.settings_screen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SettingsScreenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.amntScan;
      TextView amntScan = ViewBindings.findChildViewById(rootView, id);
      if (amntScan == null) {
        break missingId;
      }

      id = R.id.amntScanInput;
      EditText amntScanInput = ViewBindings.findChildViewById(rootView, id);
      if (amntScanInput == null) {
        break missingId;
      }

      id = R.id.backButton;
      Button backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.counter;
      CheckBox counter = ViewBindings.findChildViewById(rootView, id);
      if (counter == null) {
        break missingId;
      }

      id = R.id.settingsTitle;
      TextView settingsTitle = ViewBindings.findChildViewById(rootView, id);
      if (settingsTitle == null) {
        break missingId;
      }

      id = R.id.sound;
      CheckBox sound = ViewBindings.findChildViewById(rootView, id);
      if (sound == null) {
        break missingId;
      }

      id = R.id.timer;
      CheckBox timer = ViewBindings.findChildViewById(rootView, id);
      if (timer == null) {
        break missingId;
      }

      return new SettingsScreenBinding((FrameLayout) rootView, amntScan, amntScanInput, backButton,
          counter, settingsTitle, sound, timer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
