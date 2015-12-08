// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.text.method.PasswordTransformationMethod;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import net.hockeyapp.android.Strings;

public class LoginView extends LinearLayout
{

    public static final int EMAIL_INPUT_ID = 12291;
    public static final int HEADLINE_TEXT_ID = 12290;
    public static final int LOGIN_BUTTON_ID = 12293;
    public static final int PASSWORD_INPUT_ID = 12292;
    public static final int WRAPPER_BASE_ID = 12289;
    private LinearLayout wrapperBase;

    public LoginView(Context context)
    {
        this(context, 0);
    }

    public LoginView(Context context, int i)
    {
        super(context);
        loadLayoutParams(context);
        loadWrapperBase(context);
        loadHeadlineTextView(context);
        loadEmailInput(context);
        loadPasswordInput(context);
        loadLoginButton(context);
    }

    private Drawable getButtonSelector()
    {
        StateListDrawable statelistdrawable = new StateListDrawable();
        ColorDrawable colordrawable = new ColorDrawable(0xff000000);
        statelistdrawable.addState(new int[] {
            0xfefeff59
        }, colordrawable);
        colordrawable = new ColorDrawable(0xff444444);
        statelistdrawable.addState(new int[] {
            0xfefeff59, 0x101009c
        }, colordrawable);
        colordrawable = new ColorDrawable(0xff888888);
        statelistdrawable.addState(new int[] {
            0x10100a7
        }, colordrawable);
        return statelistdrawable;
    }

    private Drawable getEditTextBackground(Context context)
    {
        int i = (int)(context.getResources().getDisplayMetrics().density * 10F);
        ShapeDrawable shapedrawable = new ShapeDrawable(new RectShape());
        Paint paint = shapedrawable.getPaint();
        paint.setColor(-1);
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(1.0F);
        shapedrawable.setPadding(i, i, i, i);
        i = (int)((double)context.getResources().getDisplayMetrics().density * 1.5D);
        context = new ShapeDrawable(new RectShape());
        paint = context.getPaint();
        paint.setColor(0xff444444);
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(1.0F);
        context.setPadding(0, 0, 0, i);
        return new LayerDrawable(new Drawable[] {
            context, shapedrawable
        });
    }

    private void loadEmailInput(Context context)
    {
        EditText edittext = new EditText(context);
        edittext.setId(12291);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutparams.setMargins(0, 0, 0, (int)TypedValue.applyDimension(1, 30F, getResources().getDisplayMetrics()));
        edittext.setLayoutParams(layoutparams);
        edittext.setHint(Strings.get(1282));
        edittext.setImeOptions(5);
        edittext.setInputType(33);
        edittext.setTextColor(0xff888888);
        edittext.setTextSize(2, 15F);
        edittext.setTypeface(null, 0);
        edittext.setHintTextColor(0xffcccccc);
        setEditTextBackground(context, edittext);
        wrapperBase.addView(edittext);
    }

    private void loadHeadlineTextView(Context context)
    {
        context = new TextView(context);
        context.setId(12290);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutparams.setMargins(0, 0, 0, (int)TypedValue.applyDimension(1, 30F, getResources().getDisplayMetrics()));
        context.setLayoutParams(layoutparams);
        context.setText(Strings.get(1280));
        context.setTextColor(0xff888888);
        context.setTextSize(2, 18F);
        context.setTypeface(null, 0);
        wrapperBase.addView(context);
    }

    private void loadLayoutParams(Context context)
    {
        context = new android.widget.LinearLayout.LayoutParams(-1, -2);
        setBackgroundColor(-1);
        setLayoutParams(context);
    }

    private void loadLoginButton(Context context)
    {
        context = new Button(context);
        context.setId(12293);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutparams.setMargins(0, 0, 0, (int)TypedValue.applyDimension(1, 30F, getResources().getDisplayMetrics()));
        context.setLayoutParams(layoutparams);
        context.setBackgroundDrawable(getButtonSelector());
        context.setText(Strings.get(1284));
        context.setTextColor(-1);
        context.setTextSize(2, 15F);
        wrapperBase.addView(context);
    }

    private void loadPasswordInput(Context context)
    {
        EditText edittext = new EditText(context);
        edittext.setId(12292);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutparams.setMargins(0, 0, 0, (int)TypedValue.applyDimension(1, 30F, getResources().getDisplayMetrics()));
        edittext.setLayoutParams(layoutparams);
        edittext.setHint(Strings.get(1283));
        edittext.setImeOptions(5);
        edittext.setInputType(128);
        edittext.setTransformationMethod(PasswordTransformationMethod.getInstance());
        edittext.setTextColor(0xff888888);
        edittext.setTextSize(2, 15F);
        edittext.setTypeface(null, 0);
        edittext.setHintTextColor(0xffcccccc);
        setEditTextBackground(context, edittext);
        wrapperBase.addView(edittext);
    }

    private void loadWrapperBase(Context context)
    {
        wrapperBase = new LinearLayout(context);
        wrapperBase.setId(12289);
        context = new android.widget.LinearLayout.LayoutParams(-1, -1);
        int i = (int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics());
        context.gravity = 49;
        wrapperBase.setLayoutParams(context);
        wrapperBase.setPadding(i, i, i, i);
        wrapperBase.setOrientation(1);
        addView(wrapperBase);
    }

    private void setEditTextBackground(Context context, EditText edittext)
    {
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            edittext.setBackgroundDrawable(getEditTextBackground(context));
        }
    }
}
