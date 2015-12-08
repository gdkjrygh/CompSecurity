// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.Dialog;
import android.app.DialogFragment;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.weather.commons.ui.SquarePhotoView;

public class ImagePreviewDialog extends DialogFragment
{

    private Uri imageUri;

    public ImagePreviewDialog()
    {
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        super.onCreateDialog(bundle);
        return (new android.app.AlertDialog.Builder(getActivity())).create();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        getDialog().requestWindowFeature(1);
        layoutinflater = layoutinflater.inflate(com.weather.commons.R.layout.image_preview_dialog, viewgroup, false);
        ((SquarePhotoView)layoutinflater.findViewById(com.weather.commons.R.id.photo_avatar)).setImageURI(imageUri);
        return layoutinflater;
    }

    public void setImageUri(Uri uri)
    {
        imageUri = uri;
    }
}
