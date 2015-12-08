// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            UIThreadSet, ViewVisitor

class EditState extends UIThreadSet
{
    private static class EditBinding
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener, Runnable
    {

        private boolean mAlive;
        private volatile boolean mDying;
        private final ViewVisitor mEdit;
        private final Handler mHandler;
        private final WeakReference mViewRoot;

        private void cleanUp()
        {
            if (mAlive)
            {
                Object obj = (View)mViewRoot.get();
                if (obj != null)
                {
                    obj = ((View) (obj)).getViewTreeObserver();
                    if (((ViewTreeObserver) (obj)).isAlive())
                    {
                        ((ViewTreeObserver) (obj)).removeGlobalOnLayoutListener(this);
                    }
                }
                mEdit.cleanup();
            }
            mAlive = false;
        }

        public void kill()
        {
            mDying = true;
            mHandler.post(this);
        }

        public void onGlobalLayout()
        {
            run();
        }

        public void run()
        {
            if (!mAlive)
            {
                return;
            }
            View view = (View)mViewRoot.get();
            if (view == null || mDying)
            {
                cleanUp();
                return;
            } else
            {
                mEdit.visit(view);
                mHandler.removeCallbacks(this);
                mHandler.postDelayed(this, 1000L);
                return;
            }
        }

        public EditBinding(View view, ViewVisitor viewvisitor, Handler handler)
        {
            mEdit = viewvisitor;
            mViewRoot = new WeakReference(view);
            mHandler = handler;
            mAlive = true;
            mDying = false;
            view = view.getViewTreeObserver();
            if (view.isAlive())
            {
                view.addOnGlobalLayoutListener(this);
            }
            run();
        }
    }


    private static final String LOGTAG = "MixpanelAPI.EditState";
    private final Set mCurrentEdits = new HashSet();
    private final Map mIntendedEdits = new HashMap();
    private final Handler mUiThreadHandler = new Handler(Looper.getMainLooper());

    public EditState()
    {
    }

    private void applyChangesFromList(View view, List list)
    {
        Set set = mCurrentEdits;
        set;
        JVM INSTR monitorenter ;
        int j = list.size();
        int i = 0;
_L2:
        if (i < j)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        set;
        JVM INSTR monitorexit ;
        return;
        EditBinding editbinding = new EditBinding(view, (ViewVisitor)list.get(i), mUiThreadHandler);
        mCurrentEdits.add(editbinding);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        view;
        set;
        JVM INSTR monitorexit ;
        throw view;
    }

    private void applyEditsOnUiThread()
    {
        if (Thread.currentThread() == mUiThreadHandler.getLooper().getThread())
        {
            applyIntendedEdits();
            return;
        } else
        {
            mUiThreadHandler.post(new Runnable() {

                final EditState this$0;

                public void run()
                {
                    applyIntendedEdits();
                }

            
            {
                this$0 = EditState.this;
                super();
            }
            });
            return;
        }
    }

    private void applyIntendedEdits()
    {
        Iterator iterator = getAll().iterator();
        do
        {
            View view;
            List list;
            do
            {
                if (!iterator.hasNext())
                {
                    return;
                }
                Activity activity = (Activity)iterator.next();
                Object obj = activity.getClass().getCanonicalName();
                view = activity.getWindow().getDecorView().getRootView();
                synchronized (mIntendedEdits)
                {
                    obj = (List)mIntendedEdits.get(obj);
                    list = (List)mIntendedEdits.get(null);
                }
                if (obj != null)
                {
                    applyChangesFromList(view, ((List) (obj)));
                }
            } while (list == null);
            applyChangesFromList(view, list);
        } while (true);
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void add(Activity activity)
    {
        super.add(activity);
        applyEditsOnUiThread();
    }

    public volatile void add(Object obj)
    {
        add((Activity)obj);
    }

    public void remove(Activity activity)
    {
        super.remove(activity);
    }

    public volatile void remove(Object obj)
    {
        remove((Activity)obj);
    }

    public void setEdits(Map map)
    {
        obj = mCurrentEdits;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = mCurrentEdits.iterator();
_L1:
        if (iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_70;
        }
        mCurrentEdits.clear();
        synchronized (mIntendedEdits)
        {
            mIntendedEdits.clear();
            mIntendedEdits.putAll(map);
        }
        applyEditsOnUiThread();
        return;
        ((EditBinding)iterator.next()).kill();
          goto _L1
        map;
        obj;
        JVM INSTR monitorexit ;
        throw map;
        map;
        obj;
        JVM INSTR monitorexit ;
        throw map;
    }

}
