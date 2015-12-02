// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import cev;
import chp;
import com.ubercab.client.core.model.Group;
import cwz;
import eke;
import java.util.List;
import l;

// Referenced classes of package com.ubercab.client.feature.music:
//            MusicActivity

public final class a
    implements android.support.v4.view.ChangeListener
{

    final MusicActivity a;

    public final void onPageScrollStateChanged(int i)
    {
    }

    public final void onPageScrolled(int i, float f, int j)
    {
    }

    public final void onPageSelected(int i)
    {
        if (i != MusicActivity.a(a).size()) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = l.dk;
        a.i.c(new eke());
_L9:
        a.h.a(((cic) (obj)));
        return;
_L2:
        cwz.a(a);
        obj = ((Group)MusicActivity.a(a).get(i)).getType();
        i = -1;
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 3: default 116
    //                   220603521: 179
    //                   1394955557: 165
    //                   1609543476: 151;
           goto _L3 _L4 _L5 _L6
_L3:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_179;
_L7:
        switch (i)
        {
        default:
            obj = l.di;
            break;

        case 0: // '\0'
            obj = l.dg;
            break;

        case 1: // '\001'
            obj = l.dm;
            break;

        case 2: // '\002'
            obj = l.dh;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (((String) (obj)).equals("curated_playlists"))
        {
            i = 0;
        }
          goto _L7
_L5:
        if (((String) (obj)).equals("trending"))
        {
            i = 1;
        }
          goto _L7
        if (((String) (obj)).equals("keep_listening"))
        {
            i = 2;
        }
          goto _L7
        if (true) goto _L9; else goto _L8
_L8:
    }

    tener(MusicActivity musicactivity)
    {
        a = musicactivity;
        super();
    }
}
