// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.dao;

import android.util.Log;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.dao:
//            AppStatsDao

class <init>
    implements com.kofax.kmc.kut.utilities.async.kCompletedListener
{

    final AppStatsDao a;

    public void onTaskCompleted(com.kofax.kmc.kut.utilities.async.kCompletedEvent kcompletedevent)
    {
        AppStatsDao appstatsdao = a;
        appstatsdao;
        JVM INSTR monitorenter ;
        if (kcompletedevent.getTaskError() != ErrorInfo.KMC_SUCCESS)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        if (AppStatsDao.a() == null)
        {
            throw new NullPointerException("daoCalcObjSizeListener is null, indicating no listener is registered");
        }
        break MISSING_BLOCK_LABEL_38;
        kcompletedevent;
        appstatsdao;
        JVM INSTR monitorexit ;
        throw kcompletedevent;
        kcompletedevent = (pStatsDaoCalcObjSizeResult)kcompletedevent.getTaskReturnValue();
        a.setAppStatsDaoObjSize(Integer.valueOf(((pStatsDaoCalcObjSizeResult) (kcompletedevent)).daoObjSize));
        Log.d("AppStatsDao", (new StringBuilder()).append(a.getClass().getSimpleName()).append(".getAppStatsDaoObjSizeInstCnt() = ").append(a.getAppStatsDaoObjSizeInstCnt()).toString());
        Integer integer = Integer.valueOf(a.getAppStatsDaoObjSizeInstCnt().intValue() * ((pStatsDaoCalcObjSizeResult) (kcompletedevent)).daoObjSize);
        AppStatsDao.a().daoCalcObjSizeResult(integer.intValue(), ((pStatsDaoCalcObjSizeResult) (kcompletedevent)).daoObjSizeId);
        Log.d("AppStatsDao", (new StringBuilder()).append(a.getClass().getSimpleName()).append(".daoCalcObjSizeResult(").append(integer).append(")").toString());
        a.setAppStatsDaoObjSizeInstCnt(Integer.valueOf(0));
        appstatsdao;
        JVM INSTR monitorexit ;
    }

    private tedEvent(AppStatsDao appstatsdao)
    {
        a = appstatsdao;
        super();
    }

    a(AppStatsDao appstatsdao, a a1)
    {
        this(appstatsdao);
    }
}
