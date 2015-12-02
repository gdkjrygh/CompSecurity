// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.slider;

import android.app.Activity;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import cev;
import com.ubercab.client.core.model.City;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.model.vehicleview.Shape_VehicleView;
import com.ubercab.rider.realtime.model.DynamicFare;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.Fare;
import com.ubercab.rider.realtime.model.VehicleView;
import czd;
import dar;
import dpg;
import dul;
import fzf;
import gdl;
import gdm;
import hkr;
import hku;
import ica;
import icl;
import ico;
import java.util.Map;

public class FareDetailsPopupWindow extends czd
{

    private final hkr a;
    private final hku b;
    private final dpg c;
    private final Resources d;
    private final TextAppearanceSpan e;
    private final TextAppearanceSpan f;
    private icl g;
    private String h;
    TextView mTextViewAndOr;
    TextView mTextViewBaseFare;
    TextView mTextViewMessage;
    TextView mTextViewPerDistance;
    TextView mTextViewPerMinute;
    TextView mTextViewSafeRide;
    TextView mTextViewSurgeSubtext;
    TextView mTextViewSurgeTitle;
    TextView mTextViewUrl;
    ViewGroup mViewGroupContent;
    ViewGroup mViewGroupMessage;
    ViewGroup mViewGroupSafeRide;
    ViewGroup mViewGroupSurgeHeader;

    public FareDetailsPopupWindow(Activity activity, cev cev, hkr hkr1, hku hku1, dpg dpg1, String s)
    {
        super(activity, cev);
        a = hkr1;
        b = hku1;
        c = dpg1;
        h = s;
        d = activity.getResources();
        cev = LayoutInflater.from(activity).inflate(0x7f0301cd, null, false);
        ButterKnife.inject(this, cev);
        setContentView(cev);
        cev.setOnClickListener(new android.view.View.OnClickListener() {

            final FareDetailsPopupWindow a;

            public final void onClick(View view)
            {
                a.dismiss();
            }

            
            {
                a = FareDetailsPopupWindow.this;
                super();
            }
        });
        setAnimationStyle(0x7f0900d2);
        setWidth(-1);
        setHeight(-1);
        e = new TextAppearanceSpan(activity, 0x7f0901e8);
        f = new TextAppearanceSpan(activity, 0x7f0901eb);
    }

    private Spannable a(String s, String s1)
    {
        if (TextUtils.isEmpty(s) || TextUtils.isEmpty(s1))
        {
            return new SpannableString("");
        } else
        {
            s = s.toUpperCase();
            s1 = s1.toUpperCase();
            SpannableString spannablestring = new SpannableString(s);
            spannablestring.setSpan(e, 0, s.length(), 33);
            spannablestring.setSpan(f, s.indexOf(s1), s.indexOf(s1) + s1.length(), 33);
            return spannablestring;
        }
    }

    public static String a(FareDetailsPopupWindow faredetailspopupwindow)
    {
        return faredetailspopupwindow.h;
    }

    private void a(float f1)
    {
        boolean flag;
        if (f1 > 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            String s = String.format("%sx", new Object[] {
                Float.valueOf(f1)
            });
            String s1 = d.getString(0x7f070458, new Object[] {
                s
            });
            mTextViewSurgeTitle.setText(s);
            mViewGroupSurgeHeader.setVisibility(0);
            mTextViewSurgeSubtext.setText(s1);
            mTextViewSurgeSubtext.setVisibility(0);
            return;
        } else
        {
            mViewGroupSurgeHeader.setVisibility(8);
            mTextViewSurgeSubtext.setVisibility(8);
            return;
        }
    }

    public static void a(FareDetailsPopupWindow faredetailspopupwindow, boolean flag, boolean flag1, VehicleView vehicleview, DynamicFare dynamicfare)
    {
        faredetailspopupwindow.a(flag, flag1, vehicleview, dynamicfare);
    }

    private void a(DynamicFare dynamicfare, VehicleView vehicleview)
    {
        String s;
        boolean flag;
        if (dynamicfare != null && dynamicfare.getMultiplier() > 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            dynamicfare = vehicleview.getFare();
        }
        vehicleview = d.getString(0x7f0702b5, new Object[] {
            dynamicfare.getPerMinute()
        });
        s = String.format("%s / %s", new Object[] {
            dynamicfare.getPerDistanceUnit(), dynamicfare.getDistanceUnit()
        });
        mTextViewPerMinute.setText(a(((String) (vehicleview)), dynamicfare.getPerMinute()));
        mTextViewPerDistance.setText(a(s, dynamicfare.getPerDistanceUnit()));
    }

    private void a(VehicleView vehicleview)
    {
        boolean flag = "TimeAndDistance".equals(vehicleview.getFare().getType());
        TextView textview = mTextViewAndOr;
        if (flag)
        {
            vehicleview = d.getString(0x7f07005e);
        } else
        {
            vehicleview = d.getString(0x7f070307);
        }
        textview.setText(vehicleview);
    }

    private void a(boolean flag, boolean flag1, VehicleView vehicleview, DynamicFare dynamicfare)
    {
        if (vehicleview == null || !flag || !flag1)
        {
            dismiss();
            return;
        }
        float f1;
        if (dynamicfare != null)
        {
            f1 = dynamicfare.getMultiplier();
        } else
        {
            f1 = 1.0F;
        }
        a(vehicleview);
        b(vehicleview);
        a(f1);
        b(dynamicfare, vehicleview);
        a(dynamicfare, vehicleview);
        c(vehicleview);
    }

    private void b(DynamicFare dynamicfare, VehicleView vehicleview)
    {
        boolean flag;
        if (dynamicfare != null && dynamicfare.getMultiplier() > 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            dynamicfare = vehicleview.getFare();
        }
        if (dynamicfare != null && !TextUtils.isEmpty(dynamicfare.getBase()))
        {
            vehicleview = d.getString(0x7f070074, new Object[] {
                dynamicfare.getBase()
            });
            mTextViewBaseFare.setText(a(vehicleview, dynamicfare.getBase()));
            return;
        } else
        {
            mTextViewBaseFare.setVisibility(8);
            return;
        }
    }

    private void b(VehicleView vehicleview)
    {
        vehicleview = vehicleview.getFare().getSafeRidesFee();
        if (!TextUtils.isEmpty(vehicleview))
        {
            vehicleview = a(d.getString(0x7f0703b3, new Object[] {
                vehicleview
            }), vehicleview);
            mTextViewSafeRide.setText(vehicleview);
            mViewGroupSafeRide.setVisibility(0);
            return;
        } else
        {
            mViewGroupSafeRide.setVisibility(8);
            return;
        }
    }

    private void c(VehicleView vehicleview)
    {
        String s1 = vehicleview.getFareMessage();
        String s = vehicleview.getFareDetailsUrl();
        if (TextUtils.isEmpty(s1) && TextUtils.isEmpty(s))
        {
            mViewGroupContent.setVisibility(0);
            mViewGroupMessage.setVisibility(8);
            return;
        }
        mTextViewMessage.setText(s1);
        vehicleview = s;
        if (TextUtils.isEmpty(s))
        {
            vehicleview = d.getString(0x7f070776);
        }
        mTextViewUrl.setText(vehicleview);
        Linkify.addLinks(mTextViewUrl, 1);
        mViewGroupContent.setVisibility(8);
        mViewGroupMessage.setVisibility(0);
    }

    public void dismiss()
    {
        super.dismiss();
        if (g != null)
        {
            g.b();
        }
    }

    public void onPingEvent(dar dar1)
    {
        if (c.n())
        {
            return;
        }
        dar1 = dar1.a();
        boolean flag = dul.a(dar1, h);
        boolean flag1 = dul.c(dar1, h);
        VehicleView vehicleview = (VehicleView)dar1.getCity().getVehicleViews().get(h);
        if (vehicleview instanceof Shape_VehicleView)
        {
            dar1 = ((Shape_VehicleView)vehicleview).getSurge();
        } else
        {
            dar1 = null;
        }
        a(flag, flag1, vehicleview, dar1);
    }

    public void onVehicleViewEvent(fzf fzf1)
    {
        h = fzf1.a();
        Object obj = a.e();
        boolean flag;
        boolean flag1;
        if (obj != null)
        {
            fzf1 = ((Eyeball) (obj)).getNearbyVehicles();
        } else
        {
            fzf1 = null;
        }
        if (fzf1 != null && fzf1.get(h) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (obj != null)
        {
            fzf1 = ((Eyeball) (obj)).getDynamicFares();
        } else
        {
            fzf1 = null;
        }
        if (fzf1 != null)
        {
            fzf1 = (DynamicFare)fzf1.get(h);
        } else
        {
            fzf1 = null;
        }
        obj = a.b();
        if (obj != null)
        {
            obj = ((com.ubercab.rider.realtime.model.City) (obj)).findVehicleViewById(h);
        } else
        {
            obj = null;
        }
        if (obj != null && ((VehicleView) (obj)).getFare() != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        a(flag, flag1, ((VehicleView) (obj)), fzf1);
    }

    public void showAtLocation(View view, int i, int j, int k)
    {
        super.showAtLocation(view, i, j, k);
        if (g == null || g.c())
        {
            g = ica.a(b.b(), b.g(), new gdm((byte)0)).a(ico.a()).c(new gdl(this, (byte)0));
        }
    }
}
