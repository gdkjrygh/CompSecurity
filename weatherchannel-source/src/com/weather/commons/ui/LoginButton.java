// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.weather.commons.ui:
//            BackgroundSetter

public class LoginButton extends LinearLayout
{

    private Drawable backgroundDisabled;
    private Drawable backgroundNormal;
    private Drawable backgroundPressed;
    private Drawable iconNormal;
    private Drawable iconPressed;
    private String initialText;
    private ImageView logoIcon;
    private TextView textView;

    public LoginButton(Context context)
    {
        super(context);
        inflate(context, com.weather.commons.R.layout.ups_login_button, this);
    }

    public LoginButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        handleAttributes(context, attributeset);
        inflate(context, com.weather.commons.R.layout.ups_login_button, this);
    }

    public LoginButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        handleAttributes(context, attributeset);
        inflate(context, com.weather.commons.R.layout.ups_login_button, this);
    }

    private void handleAttributes(Context context, AttributeSet attributeset)
    {
        if (attributeset == null)
        {
            return;
        } else
        {
            context = context.obtainStyledAttributes(attributeset, com.weather.commons.R.styleable.LoginButton);
            initialText = context.getString(com.weather.commons.R.styleable.LoginButton_text);
            backgroundNormal = context.getDrawable(com.weather.commons.R.styleable.LoginButton_background_normal);
            backgroundPressed = context.getDrawable(com.weather.commons.R.styleable.LoginButton_background_pressed);
            backgroundDisabled = context.getDrawable(com.weather.commons.R.styleable.LoginButton_background_disabled);
            iconNormal = context.getDrawable(com.weather.commons.R.styleable.LoginButton_icon_normal);
            iconPressed = context.getDrawable(com.weather.commons.R.styleable.LoginButton_icon_pressed);
            context.recycle();
            return;
        }
    }

    private void updateState()
    {
        if (isEnabled())
        {
            boolean flag = isPressed();
            BackgroundSetter.SetBackgroundInterface setbackgroundinterface = BackgroundSetter.backgroundInterface;
            Object obj;
            if (flag && backgroundPressed != null)
            {
                obj = backgroundPressed;
            } else
            {
                obj = backgroundNormal;
            }
            setbackgroundinterface.setBackground(this, ((Drawable) (obj)));
            if (logoIcon != null)
            {
                Object obj1 = logoIcon;
                if (flag && iconPressed != null)
                {
                    obj = iconPressed;
                } else
                {
                    obj = iconNormal;
                }
                ((ImageView) (obj1)).setImageDrawable(((Drawable) (obj)));
            }
            if (textView != null)
            {
                obj = textView;
                obj1 = getContext().getResources();
                int i;
                if (flag)
                {
                    i = com.weather.commons.R.color.ups_login_pressed_color;
                } else
                {
                    i = com.weather.commons.R.color.ups_login_normal_color;
                }
                ((TextView) (obj)).setTextColor(((Resources) (obj1)).getColor(i));
            }
        } else
        {
            BackgroundSetter.SetBackgroundInterface setbackgroundinterface1 = BackgroundSetter.backgroundInterface;
            Drawable drawable;
            if (backgroundDisabled == null)
            {
                drawable = backgroundNormal;
            } else
            {
                drawable = backgroundDisabled;
            }
            setbackgroundinterface1.setBackground(this, drawable);
            if (logoIcon != null)
            {
                logoIcon.setImageDrawable(iconNormal);
            }
            if (textView != null)
            {
                textView.setTextColor(getContext().getResources().getColor(com.weather.commons.R.color.ups_login_normal_color));
                return;
            }
        }
    }

    protected void onFinishInflate()
    {
label0:
        {
            super.onFinishInflate();
            logoIcon = (ImageView)findViewById(com.weather.commons.R.id.login_button_icon);
            textView = (TextView)findViewById(com.weather.commons.R.id.login_button_text);
            if (textView != null)
            {
                textView.setText(initialText);
                initialText = null;
            }
            if (backgroundNormal == null)
            {
                backgroundNormal = getBackground();
            } else
            {
                BackgroundSetter.backgroundInterface.setBackground(this, backgroundNormal);
            }
            if (logoIcon != null)
            {
                if (iconNormal != null)
                {
                    break label0;
                }
                iconNormal = logoIcon.getDrawable();
            }
            return;
        }
        logoIcon.setImageDrawable(iconNormal);
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        updateState();
    }

    public void setPressed(boolean flag)
    {
        super.setPressed(flag);
        updateState();
    }
}
