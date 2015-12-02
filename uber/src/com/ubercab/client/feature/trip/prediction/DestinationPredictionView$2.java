// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.prediction;


// Referenced classes of package com.ubercab.client.feature.trip.prediction:
//            DestinationPredictionView

final class a
    implements Runnable
{

    final DestinationPredictionView a;

    public final void run()
    {
        DestinationPredictionView.b(a);
    }

    (DestinationPredictionView destinationpredictionview)
    {
        a = destinationpredictionview;
        super();
    }
}
