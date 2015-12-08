// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.util.Printer;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            GridLayout

final class <init>
{

    static final boolean $assertionsDisabled;
    private static final int COMPLETE = 2;
    private static final int NEW = 0;
    private static final int PENDING = 1;
    public .assertionsDisabled arcs[];
    public boolean arcsValid;
    dMap backwardLinks;
    public boolean backwardLinksValid;
    public int definedCount;
    public int deltas[];
    dMap forwardLinks;
    public boolean forwardLinksValid;
    dMap groupBounds;
    public boolean groupBoundsValid;
    public boolean hasWeights;
    public boolean hasWeightsValid;
    public final boolean horizontal;
    public int leadingMargins[];
    public boolean leadingMarginsValid;
    public int locations[];
    public boolean locationsValid;
    private int maxIndex;
    boolean orderPreserved;
    private leInt parentMax;
    private leInt parentMin;
    final GridLayout this$0;
    public int trailingMargins[];
    public boolean trailingMarginsValid;

    private void addComponentSizes(List list, dMap dmap)
    {
        for (int i = 0; i < ((val[])dmap.keys).length; i++)
        {
            include(list, ((val[])dmap.keys)[i], ((leInt[])dmap.values)[i], false);
        }

    }

    private String arcsToString(List list)
    {
        String s;
        StringBuilder stringbuilder;
        Iterator iterator;
        boolean flag;
        if (horizontal)
        {
            s = "x";
        } else
        {
            s = "y";
        }
        stringbuilder = new StringBuilder();
        flag = true;
        iterator = list.iterator();
        list = stringbuilder;
        while (iterator.hasNext()) 
        {
            Object obj = (horizontal)iterator.next();
            int i;
            int j;
            int k;
            if (flag)
            {
                flag = false;
            } else
            {
                list = list.append(", ");
            }
            i = ((horizontal) (obj)).pan.min;
            j = ((val.min) (obj)).pan.max;
            k = ((val.max) (obj)).alue.value;
            if (i < j)
            {
                obj = (new StringBuilder()).append(s).append(j).append("-").append(s).append(i).append(">=").append(k).toString();
            } else
            {
                obj = (new StringBuilder()).append(s).append(i).append("-").append(s).append(j).append("<=").append(-k).toString();
            }
            list.append(((String) (obj)));
        }
        return list.toString();
    }

    private int calculateMaxIndex()
    {
        int i = -1;
        int j = 0;
        int k = getChildCount();
        while (j < k) 
        {
            Object obj = getChildAt(j);
            obj = getLayoutParams(((View) (obj)));
            if (horizontal)
            {
                obj = ((tParams) (obj)).columnSpec;
            } else
            {
                obj = ((tParams) (obj)).rowSpec;
            }
            obj = ((tParams.rowSpec) (obj)).span;
            i = Math.max(Math.max(Math.max(i, ((val) (obj)).min), ((val) (obj)).max), ((val) (obj)).size());
            j++;
        }
        j = i;
        if (i == -1)
        {
            j = 0x80000000;
        }
        return j;
    }

    private float calculateTotalWeight()
    {
        float f = 0.0F;
        int i = 0;
        int j = getChildCount();
        while (i < j) 
        {
            Object obj = getChildAt(i);
            if (((View) (obj)).getVisibility() != 8)
            {
                obj = getLayoutParams(((View) (obj)));
                if (horizontal)
                {
                    obj = ((tParams) (obj)).columnSpec;
                } else
                {
                    obj = ((tParams) (obj)).rowSpec;
                }
                f += ((tParams.rowSpec) (obj)).weight;
            }
            i++;
        }
        return f;
    }

    private void computeArcs()
    {
        getForwardLinks();
        getBackwardLinks();
    }

    private void computeGroupBounds()
    {
        s as[] = (s[])groupBounds.values;
        for (int i = 0; i < as.length; i++)
        {
            as[i].reset();
        }

        int j = 0;
        int l = getChildCount();
        while (j < l) 
        {
            View view = getChildAt(j);
            Object obj = getLayoutParams(view);
            int k;
            int i1;
            if (horizontal)
            {
                obj = ((tParams) (obj)).columnSpec;
            } else
            {
                obj = ((tParams) (obj)).rowSpec;
            }
            i1 = getMeasurementIncludingMargin(view, horizontal);
            if (((horizontal) (obj)).weight == 0.0F)
            {
                k = 0;
            } else
            {
                k = getDeltas()[j];
            }
            ((s)groupBounds.getValue(j)).include(GridLayout.this, view, ((this._cls0) (obj)), this, i1 + k);
            j++;
        }
    }

    private boolean computeHasWeights()
    {
        int i;
        int j;
        i = 0;
        j = getChildCount();
_L2:
        Object obj;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        obj = getChildAt(i);
        if (((View) (obj)).getVisibility() != 8)
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        obj = getLayoutParams(((View) (obj)));
        if (horizontal)
        {
            obj = ((tParams) (obj)).columnSpec;
        } else
        {
            obj = ((tParams) (obj)).rowSpec;
        }
        if (((tParams.rowSpec) (obj)).weight == 0.0F) goto _L4; else goto _L3
_L3:
        return true;
        return false;
    }

    private void computeLinks(dMap dmap, boolean flag)
    {
        Object aobj[] = (leInt[])dmap.values;
        for (int i = 0; i < aobj.length; i++)
        {
            aobj[i].reset();
        }

        aobj = (s[])getGroupBounds().values;
        int j = 0;
        while (j < aobj.length) 
        {
            int k = aobj[j].size(flag);
            leInt leint = (leInt)dmap.getValue(j);
            int l = leint.value;
            if (!flag)
            {
                k = -k;
            }
            leint.value = Math.max(l, k);
            j++;
        }
    }

    private void computeLocations(int ai[])
    {
        if (!hasWeights())
        {
            solve(ai);
        } else
        {
            solveAndDistributeSpace(ai);
        }
        if (!orderPreserved)
        {
            int j = ai[0];
            int i = 0;
            for (int k = ai.length; i < k; i++)
            {
                ai[i] = ai[i] - j;
            }

        }
    }

    private void computeMargins(boolean flag)
    {
        int ai[];
        int i;
        int k;
        if (flag)
        {
            ai = leadingMargins;
        } else
        {
            ai = trailingMargins;
        }
        i = 0;
        k = getChildCount();
        while (i < k) 
        {
            View view = getChildAt(i);
            if (view.getVisibility() != 8)
            {
                Object obj = getLayoutParams(view);
                int j;
                if (horizontal)
                {
                    obj = ((tParams) (obj)).columnSpec;
                } else
                {
                    obj = ((tParams) (obj)).rowSpec;
                }
                obj = ((tParams.rowSpec) (obj)).span;
                if (flag)
                {
                    j = ((val) (obj)).min;
                } else
                {
                    j = ((val) (obj)).max;
                }
                ai[j] = Math.max(ai[j], getMargin1(view, horizontal, flag));
            }
            i++;
        }
    }

    private horizontal[] createArcs()
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        addComponentSizes(arraylist, getForwardLinks());
        addComponentSizes(arraylist1, getBackwardLinks());
        if (orderPreserved)
        {
            for (int i = 0; i < getCount(); i++)
            {
                include(arraylist, new val(i, i + 1), new leInt(0));
            }

        }
        int j = getCount();
        include(arraylist, new val(0, j), parentMin, false);
        include(arraylist1, new val(j, 0), parentMax, false);
        return (parentMax[])GridLayout.append(topologicalSort(arraylist), topologicalSort(arraylist1));
    }

    private dMap createGroupBounds()
    {
          = android.support.v7.widget..of(android/support/v7/widget/GridLayout$Spec, android/support/v7/widget/GridLayout$Bounds);
        int i = 0;
        int j = getChildCount();
        while (i < j) 
        {
            Object obj = getChildAt(i);
            obj = getLayoutParams(((View) (obj)));
            if (horizontal)
            {
                obj = ((tParams) (obj)).columnSpec;
            } else
            {
                obj = ((tParams) (obj)).rowSpec;
            }
            .put(obj, ((.put) (obj)).getAbsoluteAlignment(horizontal).getBounds());
            i++;
        }
        return .pack();
    }

    private dMap createLinks(boolean flag)
    {
          = android.support.v7.widget..of(android/support/v7/widget/GridLayout$Interval, android/support/v7/widget/GridLayout$MutableInt);
         a[] = (.of[])getGroupBounds().keys;
        int i = 0;
        int j = a.length;
        while (i < j) 
        {
            val val;
            if (flag)
            {
                val = a[i].span;
            } else
            {
                val = a[i].span.inverse();
            }
            .put(val, new leInt());
            i++;
        }
        return .pack();
    }

    private dMap getBackwardLinks()
    {
        if (backwardLinks == null)
        {
            backwardLinks = createLinks(false);
        }
        if (!backwardLinksValid)
        {
            computeLinks(backwardLinks, false);
            backwardLinksValid = true;
        }
        return backwardLinks;
    }

    private dMap getForwardLinks()
    {
        if (forwardLinks == null)
        {
            forwardLinks = createLinks(true);
        }
        if (!forwardLinksValid)
        {
            computeLinks(forwardLinks, true);
            forwardLinksValid = true;
        }
        return forwardLinks;
    }

    private int getMaxIndex()
    {
        if (maxIndex == 0x80000000)
        {
            maxIndex = Math.max(0, calculateMaxIndex());
        }
        return maxIndex;
    }

    private int getMeasure(int i, int j)
    {
        setParentConstraints(i, j);
        return size(getLocations());
    }

    private boolean hasWeights()
    {
        if (!hasWeightsValid)
        {
            hasWeights = computeHasWeights();
            hasWeightsValid = true;
        }
        return hasWeights;
    }

    private void include(List list, val val, leInt leint)
    {
        include(list, val, leint, true);
    }

    private void include(List list, val val, leInt leint, boolean flag)
    {
label0:
        {
            if (val.size() == 0)
            {
                return;
            }
            if (!flag)
            {
                break label0;
            }
            Iterator iterator = list.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
            } while (!((val.size)iterator.next()).pan.equals(val));
            return;
        }
        list.add(new init>(val, leint));
    }

    private void init(int ai[])
    {
        Arrays.fill(ai, 0);
    }

    private void logError(String s, val aval[], boolean aflag[])
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        for (int i = 0; i < aval.length; i++)
        {
            val val = aval[i];
            if (aflag[i])
            {
                arraylist.add(val);
            }
            if (!val.alid)
            {
                arraylist1.add(val);
            }
        }

        mPrinter.println((new StringBuilder()).append(s).append(" constraints: ").append(arcsToString(arraylist)).append(" are inconsistent; permanently removing: ").append(arcsToString(arraylist1)).append(". ").toString());
    }

    private boolean relax(int ai[], arcsToString arcstostring)
    {
        if (arcstostring.alid)
        {
            val val = arcstostring.pan;
            int j = val.min;
            int i = val.max;
            int k = arcstostring.alue.value;
            j = ai[j] + k;
            if (j > ai[i])
            {
                ai[i] = j;
                return true;
            }
        }
        return false;
    }

    private void setParentConstraints(int i, int j)
    {
        parentMin.value = i;
        parentMax.value = -j;
        locationsValid = false;
    }

    private void shareOutDelta(int i, float f)
    {
        Arrays.fill(deltas, 0);
        boolean flag = false;
        int l = getChildCount();
        int j = i;
        i = ((flag) ? 1 : 0);
        while (i < l) 
        {
            Object obj = getChildAt(i);
            float f1;
            int k;
            if (((View) (obj)).getVisibility() == 8)
            {
                f1 = f;
                k = j;
            } else
            {
                obj = getLayoutParams(((View) (obj)));
                float f2;
                if (horizontal)
                {
                    obj = ((tParams) (obj)).columnSpec;
                } else
                {
                    obj = ((tParams) (obj)).rowSpec;
                }
                f2 = ((tParams.rowSpec) (obj)).weight;
                k = j;
                f1 = f;
                if (f2 != 0.0F)
                {
                    k = Math.round(((float)j * f2) / f);
                    deltas[i] = k;
                    k = j - k;
                    f1 = f - f2;
                }
            }
            i++;
            j = k;
            f = f1;
        }
    }

    private int size(int ai[])
    {
        return ai[getCount()];
    }

    private boolean solve(int ai[])
    {
        return solve(getArcs(), ai);
    }

    private boolean solve(getArcs agetarcs[], int ai[])
    {
        return solve(agetarcs, ai, true);
    }

    private boolean solve(solve asolve[], int ai[], boolean flag)
    {
        String s;
        boolean aflag[];
        int l1;
        if (horizontal)
        {
            s = "horizontal";
        } else
        {
            s = "vertical";
        }
        l1 = getCount() + 1;
        aflag = null;
label0:
        for (int i = 0; i < asolve.length; i++)
        {
            init(ai);
            for (int j = 0; j < l1; j++)
            {
                boolean flag1 = false;
                int i1 = 0;
                for (int i2 = asolve.length; i1 < i2; i1++)
                {
                    flag1 |= relax(ai, asolve[i1]);
                }

                if (!flag1)
                {
                    if (aflag != null)
                    {
                        logError(s, asolve, aflag);
                    }
                    return true;
                }
            }

            if (!flag)
            {
                return false;
            }
            boolean aflag1[] = new boolean[asolve.length];
            for (int k = 0; k < l1; k++)
            {
                int j1 = 0;
                for (int k1 = asolve.length; j1 < k1; j1++)
                {
                    aflag1[j1] = aflag1[j1] | relax(ai, asolve[j1]);
                }

            }

            if (i == 0)
            {
                aflag = aflag1;
            }
            int l = 0;
            solve solve1;
            do
            {
                if (l >= asolve.length)
                {
                    continue label0;
                }
                if (aflag1[l])
                {
                    solve1 = asolve[l];
                    if (solve1.pan.min >= solve1.pan.max)
                    {
                        break;
                    }
                }
                l++;
            } while (true);
            solve1.alid = false;
        }

        return true;
    }

    private void solveAndDistributeSpace(int ai[])
    {
        Arrays.fill(getDeltas(), 0);
        solve(ai);
        int k = parentMin.value * getChildCount() + 1;
        if (k >= 2)
        {
            int i = 0;
            float f = calculateTotalWeight();
            int j = -1;
            boolean flag = true;
            while (i < k) 
            {
                int l = (i + k) / 2;
                invalidateValues();
                shareOutDelta(l, f);
                flag = solve(getArcs(), ai, false);
                if (flag)
                {
                    j = l;
                    i = l + 1;
                } else
                {
                    k = l;
                }
            }
            if (j > 0 && !flag)
            {
                invalidateValues();
                shareOutDelta(j, f);
                solve(ai);
                return;
            }
        }
    }

    private solve[] topologicalSort(List list)
    {
        return topologicalSort((topologicalSort[])list.toArray(new topologicalSort[list.size()]));
    }

    private topologicalSort[] topologicalSort(final topologicalSort arcs[])
    {
        return (new Object() {

            static final boolean $assertionsDisabled;
            GridLayout.Arc arcsByVertex[][];
            int cursor;
            GridLayout.Arc result[];
            final GridLayout.Axis this$1;
            final GridLayout.Arc val$arcs[];
            int visited[];

            GridLayout.Arc[] sort()
            {
                int i = 0;
                for (int j = arcsByVertex.length; i < j; i++)
                {
                    walk(i);
                }

                if (!$assertionsDisabled && cursor != -1)
                {
                    throw new AssertionError();
                } else
                {
                    return result;
                }
            }

            void walk(int i)
            {
                visited[i];
                JVM INSTR tableswitch 0 1: default 28
            //                           0 29
            //                           1 116;
                   goto _L1 _L2 _L3
_L1:
                return;
_L2:
                visited[i] = 1;
                GridLayout.Arc aarc[] = arcsByVertex[i];
                int k = aarc.length;
                for (int j = 0; j < k; j++)
                {
                    GridLayout.Arc arc = aarc[j];
                    walk(arc.span.max);
                    GridLayout.Arc aarc1[] = result;
                    int l = cursor;
                    cursor = l - 1;
                    aarc1[l] = arc;
                }

                visited[i] = 2;
                return;
_L3:
                if (!$assertionsDisabled)
                {
                    throw new AssertionError();
                }
                if (true) goto _L1; else goto _L4
_L4:
            }

            static 
            {
                boolean flag;
                if (!android/support/v7/widget/GridLayout.desiredAssertionStatus())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                $assertionsDisabled = flag;
            }

            
            {
                this$1 = GridLayout.Axis.this;
                arcs = aarc;
                super();
                result = new GridLayout.Arc[arcs.length];
                cursor = result.length - 1;
                arcsByVertex = groupArcsByFirstVertex(arcs);
                visited = new int[getCount() + 1];
            }
        }).sort();
    }

    public _cls1.sort[] getArcs()
    {
        if (arcs == null)
        {
            arcs = createArcs();
        }
        if (!arcsValid)
        {
            computeArcs();
            arcsValid = true;
        }
        return arcs;
    }

    public int getCount()
    {
        return Math.max(definedCount, getMaxIndex());
    }

    public int[] getDeltas()
    {
        if (deltas == null)
        {
            deltas = new int[getChildCount()];
        }
        return deltas;
    }

    public dMap getGroupBounds()
    {
        if (groupBounds == null)
        {
            groupBounds = createGroupBounds();
        }
        if (!groupBoundsValid)
        {
            computeGroupBounds();
            groupBoundsValid = true;
        }
        return groupBounds;
    }

    public int[] getLeadingMargins()
    {
        if (leadingMargins == null)
        {
            leadingMargins = new int[getCount() + 1];
        }
        if (!leadingMarginsValid)
        {
            computeMargins(true);
            leadingMarginsValid = true;
        }
        return leadingMargins;
    }

    public int[] getLocations()
    {
        if (locations == null)
        {
            locations = new int[getCount() + 1];
        }
        if (!locationsValid)
        {
            computeLocations(locations);
            locationsValid = true;
        }
        return locations;
    }

    public int getMeasure(int i)
    {
label0:
        {
label1:
            {
                boolean flag = false;
                int j = android.view..getMode(i);
                i = android.view..getSize(i);
                switch (j)
                {
                default:
                    i = ((flag) ? 1 : 0);
                    if (!$assertionsDisabled)
                    {
                        throw new AssertionError();
                    }
                    break;

                case -2147483648: 
                    break label0;

                case 1073741824: 
                    break label1;

                case 0: // '\0'
                    i = getMeasure(0, 0x186a0);
                    break;
                }
                return i;
            }
            return getMeasure(i, i);
        }
        return getMeasure(0, i);
    }

    public int[] getTrailingMargins()
    {
        if (trailingMargins == null)
        {
            trailingMargins = new int[getCount() + 1];
        }
        if (!trailingMarginsValid)
        {
            computeMargins(false);
            trailingMarginsValid = true;
        }
        return trailingMargins;
    }

    trailingMargins[][] groupArcsByFirstVertex(trailingMargins atrailingmargins[])
    {
        int i = getCount() + 1;
        trailingMargins atrailingmargins1[][] = new getCount[i][];
        int ai[] = new int[i];
        int i1 = atrailingmargins.length;
        for (int j = 0; j < i1; j++)
        {
            int j1 = atrailingmargins[j].pan.min;
            ai[j1] = ai[j1] + 1;
        }

        for (int k = 0; k < ai.length; k++)
        {
            atrailingmargins1[k] = new val.min[ai[k]];
        }

        Arrays.fill(ai, 0);
        i1 = atrailingmargins.length;
        for (int l = 0; l < i1; l++)
        {
            trailingMargins trailingmargins = atrailingmargins[l];
            int k1 = trailingmargins.pan.min;
            trailingMargins atrailingmargins2[] = atrailingmargins1[k1];
            int l1 = ai[k1];
            ai[k1] = l1 + 1;
            atrailingmargins2[l1] = trailingmargins;
        }

        return atrailingmargins1;
    }

    public void invalidateStructure()
    {
        maxIndex = 0x80000000;
        groupBounds = null;
        forwardLinks = null;
        backwardLinks = null;
        leadingMargins = null;
        trailingMargins = null;
        arcs = null;
        locations = null;
        deltas = null;
        hasWeightsValid = false;
        invalidateValues();
    }

    public void invalidateValues()
    {
        groupBoundsValid = false;
        forwardLinksValid = false;
        backwardLinksValid = false;
        leadingMarginsValid = false;
        trailingMarginsValid = false;
        arcsValid = false;
        locationsValid = false;
    }

    public boolean isOrderPreserved()
    {
        return orderPreserved;
    }

    public void layout(int i)
    {
        setParentConstraints(i, i);
        getLocations();
    }

    public void setCount(int i)
    {
        if (i != 0x80000000 && i < getMaxIndex())
        {
            StringBuilder stringbuilder = new StringBuilder();
            String s;
            if (horizontal)
            {
                s = "column";
            } else
            {
                s = "row";
            }
            GridLayout.access$100(stringbuilder.append(s).append("Count must be greater than or equal to the maximum of all grid indices ").append("(and spans) defined in the LayoutParams of each child").toString());
        }
        definedCount = i;
    }

    public void setOrderPreserved(boolean flag)
    {
        orderPreserved = flag;
        invalidateStructure();
    }

    static 
    {
        boolean flag;
        if (!android/support/v7/widget/GridLayout.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

    private getCount(boolean flag)
    {
        this$0 = GridLayout.this;
        super();
        definedCount = 0x80000000;
        maxIndex = 0x80000000;
        groupBoundsValid = false;
        forwardLinksValid = false;
        backwardLinksValid = false;
        leadingMarginsValid = false;
        trailingMarginsValid = false;
        arcsValid = false;
        locationsValid = false;
        hasWeightsValid = false;
        orderPreserved = true;
        parentMin = new leInt(0);
        parentMax = new leInt(0xfffe7960);
        horizontal = flag;
    }

    horizontal(boolean flag, horizontal horizontal1)
    {
        this(flag);
    }
}
