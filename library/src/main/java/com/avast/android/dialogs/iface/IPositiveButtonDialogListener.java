package com.avast.android.dialogs.iface;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Implement this interface in Activity or Fragment to react to positive dialog buttons.
 *
 * @author Tomáš Kypta
 * @since 2.1.0
 */
public interface IPositiveButtonDialogListener {

    public void onPositiveButtonClicked(int requestCode, @Nullable Bundle data);
}
