// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            Pathfinder, Caller

abstract class ViewVisitor
    implements Pathfinder.Accumulator
{
    public static class AddAccessibilityEventVisitor extends EventTriggeringVisitor
    {

        private final int mEventType;
        private final WeakHashMap mWatching = new WeakHashMap();

        private android.view.View.AccessibilityDelegate getOldDelegate(View view)
        {
            try
            {
                view = (android.view.View.AccessibilityDelegate)view.getClass().getMethod("getAccessibilityDelegate", new Class[0]).invoke(view, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                Log.w("MixpanelAPI.ViewVisitor", "getAccessibilityDelegate threw an exception when called.", view);
                return null;
            }
            return view;
        }

        public void accumulate(View view)
        {
            Object obj = getOldDelegate(view);
            if ((obj instanceof TrackingAccessibilityDelegate) && ((TrackingAccessibilityDelegate)obj).willFireEvent(getEventName()))
            {
                return;
            } else
            {
                obj = new TrackingAccessibilityDelegate(((android.view.View.AccessibilityDelegate) (obj)));
                view.setAccessibilityDelegate(((android.view.View.AccessibilityDelegate) (obj)));
                mWatching.put(view, obj);
                return;
            }
        }

        public void cleanup()
        {
            Iterator iterator = mWatching.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    mWatching.clear();
                    return;
                }
                Object obj = (java.util.Map.Entry)iterator.next();
                View view = (View)((java.util.Map.Entry) (obj)).getKey();
                obj = (TrackingAccessibilityDelegate)((java.util.Map.Entry) (obj)).getValue();
                android.view.View.AccessibilityDelegate accessibilitydelegate = getOldDelegate(view);
                if (accessibilitydelegate == obj)
                {
                    view.setAccessibilityDelegate(((TrackingAccessibilityDelegate) (obj)).getRealDelegate());
                } else
                if (accessibilitydelegate instanceof TrackingAccessibilityDelegate)
                {
                    ((TrackingAccessibilityDelegate)accessibilitydelegate).removeFromDelegateChain(((TrackingAccessibilityDelegate) (obj)));
                }
            } while (true);
        }

        protected String name()
        {
            return (new StringBuilder(String.valueOf(getEventName()))).append(" event when (").append(mEventType).append(")").toString();
        }

        public volatile void visit(View view)
        {
            super.visit(view);
        }


        public AddAccessibilityEventVisitor(List list, int i, String s, OnEventListener oneventlistener)
        {
            super(list, s, oneventlistener, false);
            mEventType = i;
        }
    }

    private class AddAccessibilityEventVisitor.TrackingAccessibilityDelegate extends android.view.View.AccessibilityDelegate
    {

        private android.view.View.AccessibilityDelegate mRealDelegate;
        final AddAccessibilityEventVisitor this$1;

        public android.view.View.AccessibilityDelegate getRealDelegate()
        {
            return mRealDelegate;
        }

        public void removeFromDelegateChain(AddAccessibilityEventVisitor.TrackingAccessibilityDelegate trackingaccessibilitydelegate)
        {
            if (mRealDelegate == trackingaccessibilitydelegate)
            {
                mRealDelegate = trackingaccessibilitydelegate.getRealDelegate();
            } else
            if (mRealDelegate instanceof AddAccessibilityEventVisitor.TrackingAccessibilityDelegate)
            {
                ((AddAccessibilityEventVisitor.TrackingAccessibilityDelegate)mRealDelegate).removeFromDelegateChain(trackingaccessibilitydelegate);
                return;
            }
        }

        public void sendAccessibilityEvent(View view, int i)
        {
            if (i == mEventType)
            {
                fireEvent(view);
            }
            if (mRealDelegate != null)
            {
                mRealDelegate.sendAccessibilityEvent(view, i);
            }
        }

        public boolean willFireEvent(String s)
        {
            if (getEventName() == s)
            {
                return true;
            }
            if (mRealDelegate instanceof AddAccessibilityEventVisitor.TrackingAccessibilityDelegate)
            {
                return ((AddAccessibilityEventVisitor.TrackingAccessibilityDelegate)mRealDelegate).willFireEvent(s);
            } else
            {
                return false;
            }
        }

        public AddAccessibilityEventVisitor.TrackingAccessibilityDelegate(android.view.View.AccessibilityDelegate accessibilitydelegate)
        {
            this$1 = AddAccessibilityEventVisitor.this;
            super();
            mRealDelegate = accessibilitydelegate;
        }
    }

    public static class AddTextChangeListener extends EventTriggeringVisitor
    {

        private final Map mWatching = new HashMap();

        public void accumulate(View view)
        {
            if (view instanceof TextView)
            {
                view = (TextView)view;
                TrackingTextWatcher trackingtextwatcher = new TrackingTextWatcher(view);
                TextWatcher textwatcher = (TextWatcher)mWatching.get(view);
                if (textwatcher != null)
                {
                    view.removeTextChangedListener(textwatcher);
                }
                view.addTextChangedListener(trackingtextwatcher);
                mWatching.put(view, trackingtextwatcher);
            }
        }

        public void cleanup()
        {
            Iterator iterator = mWatching.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    mWatching.clear();
                    return;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                ((TextView)entry.getKey()).removeTextChangedListener((TextWatcher)entry.getValue());
            } while (true);
        }

        protected String name()
        {
            return (new StringBuilder(String.valueOf(getEventName()))).append(" on Text Change").toString();
        }

        public volatile void visit(View view)
        {
            super.visit(view);
        }

        public AddTextChangeListener(List list, String s, OnEventListener oneventlistener)
        {
            super(list, s, oneventlistener, true);
        }
    }

    private class AddTextChangeListener.TrackingTextWatcher
        implements TextWatcher
    {

        private final View mBoundTo;
        final AddTextChangeListener this$1;

        public void afterTextChanged(Editable editable)
        {
            fireEvent(mBoundTo);
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public AddTextChangeListener.TrackingTextWatcher(View view)
        {
            this$1 = AddTextChangeListener.this;
            super();
            mBoundTo = view;
        }
    }

    private static class CycleDetector
    {

        private boolean detectSubgraphCycle(TreeMap treemap, View view, List list)
        {
            if (list.contains(view))
            {
                return false;
            }
            if (!treemap.containsKey(view)) goto _L2; else goto _L1
_L1:
            List list1;
            int i;
            int j;
            list1 = (List)treemap.remove(view);
            list.add(view);
            j = list1.size();
            i = 0;
_L6:
            if (i < j) goto _L4; else goto _L3
_L3:
            list.remove(view);
_L2:
            return true;
_L4:
            if (!detectSubgraphCycle(treemap, (View)list1.get(i), list))
            {
                return false;
            }
            i++;
            if (true) goto _L6; else goto _L5
_L5:
        }

        public boolean hasCycle(TreeMap treemap)
        {
            ArrayList arraylist = new ArrayList();
            do
            {
                if (treemap.isEmpty())
                {
                    return true;
                }
            } while (detectSubgraphCycle(treemap, (View)treemap.firstKey(), arraylist));
            return false;
        }

        private CycleDetector()
        {
        }

        CycleDetector(CycleDetector cycledetector)
        {
            this();
        }
    }

    private static abstract class EventTriggeringVisitor extends ViewVisitor
    {

        private final boolean mDebounce;
        private final String mEventName;
        private final OnEventListener mListener;

        protected void fireEvent(View view)
        {
            mListener.OnEvent(view, mEventName, mDebounce);
        }

        protected String getEventName()
        {
            return mEventName;
        }

        public EventTriggeringVisitor(List list, String s, OnEventListener oneventlistener, boolean flag)
        {
            super(list);
            mListener = oneventlistener;
            mEventName = s;
            mDebounce = flag;
        }
    }

    public static class LayoutErrorMessage
    {

        private final String mErrorType;
        private final String mName;

        public String getErrorType()
        {
            return mErrorType;
        }

        public String getName()
        {
            return mName;
        }

        public LayoutErrorMessage(String s, String s1)
        {
            mErrorType = s;
            mName = s1;
        }
    }

    public static class LayoutRule
    {

        public final int anchor;
        public final int verb;
        public final int viewId;

        public LayoutRule(int i, int j, int k)
        {
            viewId = i;
            verb = j;
            anchor = k;
        }
    }

    public static class LayoutUpdateVisitor extends ViewVisitor
    {

        private static final Set mHorizontalRules = new HashSet(Arrays.asList(new Integer[] {
            Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(5), Integer.valueOf(7)
        }));
        private static final Set mVerticalRules = new HashSet(Arrays.asList(new Integer[] {
            Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(6), Integer.valueOf(8)
        }));
        private boolean mAlive;
        private final List mArgs;
        private final CycleDetector mCycleDetector = new CycleDetector(null);
        private final String mName;
        private final OnLayoutErrorListener mOnLayoutErrorListener;
        private final WeakHashMap mOriginalValues = new WeakHashMap();

        private boolean verifyLayout(Set set, SparseArray sparsearray)
        {
            TreeMap treemap;
            int i;
            int j;
            treemap = new TreeMap(new Comparator() {

                final LayoutUpdateVisitor this$1;

                public int compare(View view, View view1)
                {
                    if (view == view1)
                    {
                        return 0;
                    }
                    if (view == null)
                    {
                        return -1;
                    }
                    if (view1 == null)
                    {
                        return 1;
                    } else
                    {
                        return view1.hashCode() - view.hashCode();
                    }
                }

                public volatile int compare(Object obj, Object obj1)
                {
                    return compare((View)obj, (View)obj1);
                }

            
            {
                this$1 = LayoutUpdateVisitor.this;
                super();
            }
            });
            j = sparsearray.size();
            i = 0;
_L2:
            if (i >= j)
            {
                return mCycleDetector.hasCycle(treemap);
            }
            View view = (View)sparsearray.valueAt(i);
            int ai[] = ((android.widget.RelativeLayout.LayoutParams)view.getLayoutParams()).getRules();
            ArrayList arraylist = new ArrayList();
            Iterator iterator = set.iterator();
            do
            {
label0:
                {
                    if (iterator.hasNext())
                    {
                        break label0;
                    }
                    treemap.put(view, arraylist);
                    i++;
                }
                if (true)
                {
                    continue;
                }
                int k = ai[((Integer)iterator.next()).intValue()];
                if (k > 0 && k != view.getId())
                {
                    arraylist.add((View)sparsearray.get(k));
                }
            } while (true);
            if (true) goto _L2; else goto _L1
_L1:
        }

        public void accumulate(View view)
        {
            SparseArray sparsearray;
            int i;
            int j;
            view = (ViewGroup)view;
            sparsearray = new SparseArray();
            j = view.getChildCount();
            i = 0;
_L3:
            if (i < j) goto _L2; else goto _L1
_L1:
            j = mArgs.size();
            i = 0;
_L4:
            if (i >= j)
            {
                return;
            }
            break MISSING_BLOCK_LABEL_85;
_L2:
            View view1 = view.getChildAt(i);
            int k = view1.getId();
            if (k > 0)
            {
                sparsearray.put(k, view1);
            }
            i++;
              goto _L3
            view = (LayoutRule)mArgs.get(i);
            View view2 = (View)sparsearray.get(((LayoutRule) (view)).viewId);
            if (view2 != null)
            {
                android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)view2.getLayoutParams();
                int ai[] = (int[])layoutparams.getRules().clone();
                if (ai[((LayoutRule) (view)).verb] != ((LayoutRule) (view)).anchor)
                {
                    if (!mOriginalValues.containsKey(view2))
                    {
                        mOriginalValues.put(view2, ai);
                    }
                    layoutparams.addRule(((LayoutRule) (view)).verb, ((LayoutRule) (view)).anchor);
                    if (mHorizontalRules.contains(Integer.valueOf(((LayoutRule) (view)).verb)))
                    {
                        view = mHorizontalRules;
                    } else
                    if (mVerticalRules.contains(Integer.valueOf(((LayoutRule) (view)).verb)))
                    {
                        view = mVerticalRules;
                    } else
                    {
                        view = null;
                    }
                    if (view != null && !verifyLayout(view, sparsearray))
                    {
                        cleanup();
                        mOnLayoutErrorListener.onLayoutError(new LayoutErrorMessage("circular_dependency", mName));
                        return;
                    }
                    view2.setLayoutParams(layoutparams);
                }
            }
            i++;
              goto _L4
        }

        public void cleanup()
        {
            Iterator iterator = mOriginalValues.entrySet().iterator();
_L2:
            if (!iterator.hasNext())
            {
                mAlive = false;
                return;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            View view = (View)entry.getKey();
            int ai[] = (int[])entry.getValue();
            android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)view.getLayoutParams();
            int i = 0;
            do
            {
label0:
                {
                    if (i < ai.length)
                    {
                        break label0;
                    }
                    view.setLayoutParams(layoutparams);
                }
                if (true)
                {
                    continue;
                }
                layoutparams.addRule(i, ai[i]);
                i++;
            } while (true);
            if (true) goto _L2; else goto _L1
_L1:
        }

        protected String name()
        {
            return "Layout Update";
        }

        public void visit(View view)
        {
            if (mAlive)
            {
                getPathfinder().findTargetsInRoot(view, getPath(), this);
            }
        }


        public LayoutUpdateVisitor(List list, List list1, String s, OnLayoutErrorListener onlayouterrorlistener)
        {
            super(list);
            mArgs = list1;
            mName = s;
            mAlive = true;
            mOnLayoutErrorListener = onlayouterrorlistener;
        }
    }

    public static interface OnEventListener
    {

        public abstract void OnEvent(View view, String s, boolean flag);
    }

    public static interface OnLayoutErrorListener
    {

        public abstract void onLayoutError(LayoutErrorMessage layouterrormessage);
    }

    public static class PropertySetVisitor extends ViewVisitor
    {

        private final Caller mAccessor;
        private final Caller mMutator;
        private final Object mOriginalValueHolder[] = new Object[1];
        private final WeakHashMap mOriginalValues = new WeakHashMap();

        public void accumulate(View view)
        {
            if (mAccessor == null) goto _L2; else goto _L1
_L1:
            Object aobj[] = mMutator.getArgs();
            if (1 != aobj.length) goto _L2; else goto _L3
_L3:
            Object obj;
            Object obj1;
            obj1 = aobj[0];
            obj = mAccessor.applyMethod(view);
            if (obj1 != obj) goto _L5; else goto _L4
_L4:
            return;
_L5:
            if (obj1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            if (!(obj1 instanceof Bitmap) || !(obj instanceof Bitmap)) goto _L7; else goto _L6
_L6:
            if (((Bitmap)obj1).sameAs((Bitmap)obj)) goto _L4; else goto _L8
_L8:
            Bitmap bitmap;
            if (!(obj instanceof Bitmap) && !(obj instanceof BitmapDrawable) && !mOriginalValues.containsKey(view))
            {
                mOriginalValueHolder[0] = obj;
                if (mMutator.argsAreApplicable(mOriginalValueHolder))
                {
                    mOriginalValues.put(view, obj);
                } else
                {
                    mOriginalValues.put(view, null);
                }
            }
_L2:
            mMutator.applyMethod(view);
            return;
_L7:
            if (!(obj1 instanceof BitmapDrawable) || !(obj instanceof BitmapDrawable))
            {
                continue; /* Loop/switch isn't completed */
            }
            obj1 = ((BitmapDrawable)obj1).getBitmap();
            bitmap = ((BitmapDrawable)obj).getBitmap();
            if (obj1 == null || !((Bitmap) (obj1)).sameAs(bitmap)) goto _L8; else goto _L9
_L9:
            return;
            if (!obj1.equals(obj)) goto _L8; else goto _L10
_L10:
        }

        public void cleanup()
        {
            Iterator iterator = mOriginalValues.entrySet().iterator();
            do
            {
                View view;
                Object obj;
                do
                {
                    if (!iterator.hasNext())
                    {
                        return;
                    }
                    obj = (java.util.Map.Entry)iterator.next();
                    view = (View)((java.util.Map.Entry) (obj)).getKey();
                    obj = ((java.util.Map.Entry) (obj)).getValue();
                } while (obj == null);
                mOriginalValueHolder[0] = obj;
                mMutator.applyMethodWithArguments(view, mOriginalValueHolder);
            } while (true);
        }

        protected String name()
        {
            return "Property Mutator";
        }

        public volatile void visit(View view)
        {
            visit(view);
        }

        public PropertySetVisitor(List list, Caller caller, Caller caller1)
        {
            super(list);
            mMutator = caller;
            mAccessor = caller1;
        }
    }

    public static class ViewDetectorVisitor extends EventTriggeringVisitor
    {

        private boolean mSeen;

        public void accumulate(View view)
        {
            if (view != null && !mSeen)
            {
                fireEvent(view);
            }
            boolean flag;
            if (view != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mSeen = flag;
        }

        public void cleanup()
        {
        }

        protected String name()
        {
            return (new StringBuilder(String.valueOf(getEventName()))).append(" when Detected").toString();
        }

        public volatile void visit(View view)
        {
            super.visit(view);
        }

        public ViewDetectorVisitor(List list, String s, OnEventListener oneventlistener)
        {
            super(list, s, oneventlistener, false);
            mSeen = false;
        }
    }


    private static final String LOGTAG = "MixpanelAPI.ViewVisitor";
    private final List mPath;
    private final Pathfinder mPathfinder = new Pathfinder();

    protected ViewVisitor(List list)
    {
        mPath = list;
    }

    public abstract void cleanup();

    protected List getPath()
    {
        return mPath;
    }

    protected Pathfinder getPathfinder()
    {
        return mPathfinder;
    }

    protected abstract String name();

    public void visit(View view)
    {
        mPathfinder.findTargetsInRoot(view, mPath, this);
    }
}
