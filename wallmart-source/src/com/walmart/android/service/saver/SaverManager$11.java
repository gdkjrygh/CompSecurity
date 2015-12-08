// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;


// Referenced classes of package com.walmart.android.service.saver:
//            SaverManager

class cAllTask
    implements com.walmart.android.wmservice.uthCallback
{

    final SaverManager this$0;
    final cAllTask val$syncAllTask;

    public void onFailure(int i)
    {
        SaverManager.access$1100(SaverManager.this, Integer.valueOf(i));
    }

    public void onSuccess()
    {
        if (!val$syncAllTask.isCancelled())
        {
            val$syncAllTask.execute(new Void[0]);
        }
    }

    cAllTask()
    {
        this$0 = final_savermanager;
        val$syncAllTask = cAllTask.this;
        super();
    }
}
