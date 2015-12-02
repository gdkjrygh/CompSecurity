// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.LinearLayout;
import com.ubercab.client.feature.estimate.FareEstimateFragment;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.DynamicFare;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.VehicleView;
import com.ubercab.rider.realtime.response.FareEstimate;
import com.ubercab.rider.realtime.response.FareEstimateResponse;
import com.ubercab.ui.TextView;
import java.util.Map;

public final class eax
    implements icg
{

    final FareEstimateFragment a;

    private eax(FareEstimateFragment fareestimatefragment)
    {
        a = fareestimatefragment;
        super();
    }

    public eax(FareEstimateFragment fareestimatefragment, byte byte0)
    {
        this(fareestimatefragment);
    }

    private DynamicFare a(String s)
    {
        DynamicFare dynamicfare = null;
        Object obj = a.d.e();
        if (obj != null)
        {
            obj = ((Eyeball) (obj)).getDynamicFares();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            dynamicfare = (DynamicFare)((Map) (obj)).get(s);
        }
        return dynamicfare;
    }

    private void a(FareEstimateResponse fareestimateresponse)
    {
        int i = 1;
        boolean flag = false;
        a.e();
        fareestimateresponse = fareestimateresponse.getEstimate();
        if (fareestimateresponse != null)
        {
            a.mTextViewFare.setVisibility(0);
            a.mTextViewFare.setText(fareestimateresponse.getFareEstimateString());
            fareestimateresponse = fareestimateresponse.getFareEstimateRange();
            if (fareestimateresponse != null && FareEstimateFragment.b(a) != 0.0F)
            {
                fareestimateresponse = fqg.a(fareestimateresponse, FareEstimateFragment.b(a));
                a.mTextViewFarePoints.setText(a.getString(0x7f070232, new Object[] {
                    fareestimateresponse
                }));
                a.mTextViewFarePoints.setVisibility(0);
                a.mTextViewFarePointsExplanation.setText(a.getString(0x7f070233));
                a.mTextViewFarePointsExplanation.setVisibility(0);
            }
            a.mViewGroupResults.setVisibility(0);
            a.mTextViewMessage.setVisibility(0);
            a.mTextViewMessage.setText(a.getString(0x7f070230));
            Object obj = a.d.b();
            if (obj != null)
            {
                fareestimateresponse = a.h.E();
                obj = ((City) (obj)).findVehicleViewById(fareestimateresponse);
                if (obj != null)
                {
                    a.mTextViewVehicle.setText(((VehicleView) (obj)).getDescription());
                    a.mTextViewVehicle.setVisibility(0);
                    fareestimateresponse = a(((String) (fareestimateresponse)));
                    if (fareestimateresponse == null || fareestimateresponse.getMultiplier() <= 1.0F)
                    {
                        i = 0;
                    }
                    fareestimateresponse = a.mViewGroupSurge;
                    if (i != 0)
                    {
                        i = ((flag) ? 1 : 0);
                    } else
                    {
                        i = 8;
                    }
                    fareestimateresponse.setVisibility(i);
                    return;
                }
            }
        }
    }

    public final void a()
    {
    }

    public final volatile void a(Object obj)
    {
        a((FareEstimateResponse)obj);
    }

    public final void a(Throwable throwable)
    {
        a.e();
        FareEstimateFragment.a(a);
    }
}
