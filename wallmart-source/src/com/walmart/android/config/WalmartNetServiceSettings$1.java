// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.config;

import com.walmartlabs.kangaroo.service.Header;
import java.util.ArrayList;

// Referenced classes of package com.walmart.android.config:
//            WalmartNetServiceSettings

static final class cess._cls400 extends ArrayList
{

    rverOption()
    {
        add(new rverOption("Production", "www.walmart.com"));
        add(new rverOption("Production-B", "www.walmart.com", new Header[] {
            WalmartNetServiceSettings.access$000()
        }));
        add(new rverOption("Production-C", "www.walmart.com", new Header[] {
            WalmartNetServiceSettings.access$100()
        }));
        add(new rverOption("Production-D", "www.walmart.com", new Header[] {
            WalmartNetServiceSettings.access$200()
        }));
        add(new rverOption("Production-P", "www.walmart.com", new Header[] {
            WalmartNetServiceSettings.access$300()
        }));
        add(new rverOption("E16", "www-e16.walmart.com"));
        add(new rverOption("E16 - Stage 2", "www-e16.walmart.com", new Header[] {
            WalmartNetServiceSettings.access$400()
        }));
    }
}
