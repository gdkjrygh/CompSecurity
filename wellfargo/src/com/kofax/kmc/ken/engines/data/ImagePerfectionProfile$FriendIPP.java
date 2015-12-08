// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import java.io.File;
import org.a.a.a.b;

// Referenced classes of package com.kofax.kmc.ken.engines.data:
//            ImagePerfectionProfile

public class PERATION
{

    final ImagePerfectionProfile this$0;

    public String toFinalOpString()
    {
        String s1 = ImagePerfectionProfile.access$000(ImagePerfectionProfile.this);
        String s2 = ImagePerfectionProfile.access$100(ImagePerfectionProfile.this);
        if (!b.b(s1))
        {
            return s1;
        }
        if (!b.b(s2))
        {
            if ((new File(s2)).exists())
            {
                String s = s1;
                if (s1 == null)
                {
                    s = "";
                }
                s = (new StringBuilder()).append(s).append("_LoadOperationsStringTokensFromFile_<").toString();
                s = (new StringBuilder()).append(s).append(s2).toString();
                return (new StringBuilder()).append(s).append(">").toString();
            } else
            {
                throw new KmcException(ErrorInfo.KMC_GN_FILE_NOT_FOUND);
            }
        } else
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_ED_IMAGE_PERFECTION_PROFILE_EMPTY);
        }
    }

    public (String s)
    {
        this$0 = ImagePerfectionProfile.this;
        super();
        if (!b.c(s, "com.kofax"))
        {
            throw new KmcException(ErrorInfo.KMC_GN_UNSUPPORTED_OPERATION);
        } else
        {
            return;
        }
    }
}
