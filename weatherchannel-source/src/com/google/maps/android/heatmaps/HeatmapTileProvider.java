// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android.heatmaps;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.support.v4.util.LongSparseArray;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileProvider;
import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.quadtree.PointQuadTree;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.maps.android.heatmaps:
//            Gradient, WeightedLatLng

public class HeatmapTileProvider
    implements TileProvider
{
    public static class Builder
    {

        private Collection data;
        private Gradient gradient;
        private double opacity;
        private int radius;

        public HeatmapTileProvider build()
        {
            if (data == null)
            {
                throw new IllegalStateException("No input data: you must use either .data or .weightedData before building");
            } else
            {
                return new HeatmapTileProvider(this);
            }
        }

        public Builder data(Collection collection)
        {
            return weightedData(HeatmapTileProvider.wrapData(collection));
        }

        public Builder gradient(Gradient gradient1)
        {
            gradient = gradient1;
            return this;
        }

        public Builder opacity(double d)
        {
            opacity = d;
            if (opacity < 0.0D || opacity > 1.0D)
            {
                throw new IllegalArgumentException("Opacity must be in range [0, 1]");
            } else
            {
                return this;
            }
        }

        public Builder radius(int i)
        {
            radius = i;
            if (radius < 10 || radius > 50)
            {
                throw new IllegalArgumentException("Radius not within bounds.");
            } else
            {
                return this;
            }
        }

        public Builder weightedData(Collection collection)
        {
            data = collection;
            if (data.isEmpty())
            {
                throw new IllegalArgumentException("No input points.");
            } else
            {
                return this;
            }
        }





        public Builder()
        {
            radius = 20;
            gradient = HeatmapTileProvider.DEFAULT_GRADIENT;
            opacity = 0.69999999999999996D;
        }
    }


    public static final Gradient DEFAULT_GRADIENT = new Gradient(DEFAULT_GRADIENT_COLORS, DEFAULT_GRADIENT_START_POINTS);
    private static final int DEFAULT_GRADIENT_COLORS[] = {
        Color.rgb(102, 225, 0), Color.rgb(255, 0, 0)
    };
    private static final float DEFAULT_GRADIENT_START_POINTS[] = {
        0.2F, 1.0F
    };
    private static final int DEFAULT_MAX_ZOOM = 11;
    private static final int DEFAULT_MIN_ZOOM = 5;
    public static final double DEFAULT_OPACITY = 0.69999999999999996D;
    public static final int DEFAULT_RADIUS = 20;
    private static final int MAX_RADIUS = 50;
    private static final int MAX_ZOOM_LEVEL = 22;
    private static final int MIN_RADIUS = 10;
    private static final int SCREEN_SIZE = 1280;
    private static final int TILE_DIM = 512;
    static final double WORLD_WIDTH = 1D;
    private Bounds mBounds;
    private int mColorMap[];
    private Collection mData;
    private Gradient mGradient;
    private double mKernel[];
    private double mMaxIntensity[];
    private double mOpacity;
    private int mRadius;
    private PointQuadTree mTree;

    private HeatmapTileProvider(Builder builder)
    {
        mData = builder.data;
        mRadius = builder.radius;
        mGradient = builder.gradient;
        mOpacity = builder.opacity;
        mKernel = generateKernel(mRadius, (double)mRadius / 3D);
        setGradient(mGradient);
        setWeightedData(mData);
    }


    static Bitmap colorize(double ad[][], int ai[], double d)
    {
        int k = ai[ai.length - 1];
        d = (double)(ai.length - 1) / d;
        int l = ad.length;
        int ai1[] = new int[l * l];
        for (int i = 0; i < l; i++)
        {
            int j = 0;
            while (j < l) 
            {
                double d1 = ad[j][i];
                int i1 = i * l + j;
                int j1 = (int)(d1 * d);
                if (d1 != 0.0D)
                {
                    if (j1 < ai.length)
                    {
                        ai1[i1] = ai[j1];
                    } else
                    {
                        ai1[i1] = k;
                    }
                } else
                {
                    ai1[i1] = 0;
                }
                j++;
            }
        }

        ad = Bitmap.createBitmap(l, l, android.graphics.Bitmap.Config.ARGB_8888);
        ad.setPixels(ai1, 0, l, 0, 0, l, l);
        return ad;
    }

    private static Tile convertBitmap(Bitmap bitmap)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, bytearrayoutputstream);
        return new Tile(512, 512, bytearrayoutputstream.toByteArray());
    }

    static double[][] convolve(double ad[][], double ad1[])
    {
        int i = (int)Math.floor((double)ad1.length / 2D);
        int k2 = ad.length;
        int l2 = k2 - i * 2;
        int l = (i + l2) - 1;
        double ad2[][] = (double[][])Array.newInstance(Double.TYPE, new int[] {
            k2, k2
        });
        for (int i1 = 0; i1 < k2; i1++)
        {
            int j;
            int i2;
            for (int k1 = 0; k1 < k2; k1++)
            {
                double d = ad[i1][k1];
                if (d == 0.0D)
                {
                    continue;
                }
                if (l < i1 + i)
                {
                    i2 = l;
                } else
                {
                    i2 = i1 + i;
                }
                if (i > i1 - i)
                {
                    j = i;
                } else
                {
                    j = i1 - i;
                }
                for (; j < i2 + 1; j++)
                {
                    double ad3[] = ad2[j];
                    ad3[k1] = ad3[k1] + ad1[j - (i1 - i)] * d;
                }

            }

        }

        ad = (double[][])Array.newInstance(Double.TYPE, new int[] {
            l2, l2
        });
        for (int j1 = i; j1 < l + 1; j1++)
        {
            int k;
            int j2;
            for (int l1 = 0; l1 < k2; l1++)
            {
                double d1 = ad2[j1][l1];
                if (d1 == 0.0D)
                {
                    continue;
                }
                if (l < l1 + i)
                {
                    j2 = l;
                } else
                {
                    j2 = l1 + i;
                }
                if (i > l1 - i)
                {
                    k = i;
                } else
                {
                    k = l1 - i;
                }
                for (; k < j2 + 1; k++)
                {
                    double ad4[] = ad[j1 - i];
                    int i3 = k - i;
                    ad4[i3] = ad4[i3] + ad1[k - (l1 - i)] * d1;
                }

            }

        }

        return ad;
    }

    static double[] generateKernel(int i, double d)
    {
        double ad[] = new double[i * 2 + 1];
        for (int j = -i; j <= i; j++)
        {
            ad[j + i] = Math.exp((double)(-j * j) / (2D * d * d));
        }

        return ad;
    }

    static Bounds getBounds(Collection collection)
    {
        collection = collection.iterator();
        WeightedLatLng weightedlatlng = (WeightedLatLng)collection.next();
        double d6 = weightedlatlng.getPoint().x;
        double d2 = weightedlatlng.getPoint().x;
        double d1 = weightedlatlng.getPoint().y;
        double d = weightedlatlng.getPoint().y;
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            WeightedLatLng weightedlatlng1 = (WeightedLatLng)collection.next();
            double d7 = weightedlatlng1.getPoint().x;
            double d3 = weightedlatlng1.getPoint().y;
            double d4 = d6;
            if (d7 < d6)
            {
                d4 = d7;
            }
            double d5 = d2;
            if (d7 > d2)
            {
                d5 = d7;
            }
            d7 = d1;
            if (d3 < d1)
            {
                d7 = d3;
            }
            d6 = d4;
            d2 = d5;
            d1 = d7;
            if (d3 > d)
            {
                d = d3;
                d6 = d4;
                d2 = d5;
                d1 = d7;
            }
        } while (true);
        return new Bounds(d6, d2, d1, d);
    }

    private double[] getMaxIntensities(int i)
    {
        double ad[] = new double[22];
        for (int j = 5; j < 11; j++)
        {
            ad[j] = getMaxValue(mData, mBounds, i, (int)(1280D * Math.pow(2D, j - 3)));
            if (j != 5)
            {
                continue;
            }
            for (int k = 0; k < j; k++)
            {
                ad[k] = ad[j];
            }

        }

        for (i = 11; i < 22; i++)
        {
            ad[i] = ad[10];
        }

        return ad;
    }

    static double getMaxValue(Collection collection, Bounds bounds, int i, int j)
    {
        double d1 = bounds.minX;
        double d = bounds.maxX;
        double d2 = bounds.minY;
        double d3 = bounds.maxY;
        LongSparseArray longsparsearray;
        Iterator iterator;
        if (d - d1 > d3 - d2)
        {
            d -= d1;
        } else
        {
            d = d3 - d2;
        }
        d3 = (double)(int)((double)(j / (i * 2)) + 0.5D) / d;
        longsparsearray = new LongSparseArray();
        d = 0.0D;
        iterator = collection.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            WeightedLatLng weightedlatlng = (WeightedLatLng)iterator.next();
            double d4 = weightedlatlng.getPoint().x;
            double d5 = weightedlatlng.getPoint().y;
            i = (int)((d4 - d1) * d3);
            j = (int)((d5 - d2) * d3);
            bounds = (LongSparseArray)longsparsearray.get(i);
            collection = bounds;
            if (bounds == null)
            {
                collection = new LongSparseArray();
                longsparsearray.put(i, collection);
            }
            Double double1 = (Double)collection.get(j);
            bounds = double1;
            if (double1 == null)
            {
                bounds = Double.valueOf(0.0D);
            }
            bounds = Double.valueOf(bounds.doubleValue() + weightedlatlng.getIntensity());
            collection.put(j, bounds);
            if (bounds.doubleValue() > d)
            {
                d = bounds.doubleValue();
            }
        } while (true);
        return d;
    }

    private static Collection wrapData(Collection collection)
    {
        ArrayList arraylist = new ArrayList();
        for (collection = collection.iterator(); collection.hasNext(); arraylist.add(new WeightedLatLng((LatLng)collection.next()))) { }
        return arraylist;
    }

    public Tile getTile(int i, int j, int k)
    {
        double d;
        double d1;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        Object obj;
        d = 1.0D / Math.pow(2D, k);
        d1 = ((double)mRadius * d) / 512D;
        d2 = (d + 2D * d1) / (double)(mRadius * 2 + 512);
        d3 = (double)i * d - d1;
        d4 = (double)(i + 1) * d + d1;
        d5 = (double)j * d - d1;
        d6 = (double)(j + 1) * d + d1;
        d = 0.0D;
        obj = new ArrayList();
        if (d3 >= 0.0D) goto _L2; else goto _L1
_L1:
        obj = new Bounds(1.0D + d3, 1.0D, d5, d6);
        d = -1D;
        obj = mTree.search(((Bounds) (obj)));
_L4:
        Bounds bounds;
        bounds = new Bounds(d3, d4, d5, d6);
        if (!bounds.intersects(new Bounds(mBounds.minX - d1, mBounds.maxX + d1, mBounds.minY - d1, mBounds.maxY + d1)))
        {
            return TileProvider.NO_TILE;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (d4 > 1.0D)
        {
            obj = new Bounds(0.0D, d4 - 1.0D, d5, d6);
            d = 1.0D;
            obj = mTree.search(((Bounds) (obj)));
        }
        if (true) goto _L4; else goto _L3
_L3:
        Object obj1 = mTree.search(bounds);
        if (((Collection) (obj1)).isEmpty())
        {
            return TileProvider.NO_TILE;
        }
        i = mRadius;
        j = mRadius;
        double ad[][] = (double[][])Array.newInstance(Double.TYPE, new int[] {
            i * 2 + 512, j * 2 + 512
        });
        for (obj1 = ((Collection) (obj1)).iterator(); ((Iterator) (obj1)).hasNext();)
        {
            WeightedLatLng weightedlatlng1 = (WeightedLatLng)((Iterator) (obj1)).next();
            Point point1 = weightedlatlng1.getPoint();
            i = (int)((point1.x - d3) / d2);
            j = (int)((point1.y - d5) / d2);
            double ad2[] = ad[i];
            ad2[j] = ad2[j] + weightedlatlng1.getIntensity();
        }

        for (obj = ((Collection) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            WeightedLatLng weightedlatlng = (WeightedLatLng)((Iterator) (obj)).next();
            Point point = weightedlatlng.getPoint();
            i = (int)(((point.x + d) - d3) / d2);
            j = (int)((point.y - d5) / d2);
            double ad1[] = ad[i];
            ad1[j] = ad1[j] + weightedlatlng.getIntensity();
        }

        return convertBitmap(colorize(convolve(ad, mKernel), mColorMap, mMaxIntensity[k]));
    }

    public void setData(Collection collection)
    {
        setWeightedData(wrapData(collection));
    }

    public void setGradient(Gradient gradient)
    {
        mGradient = gradient;
        mColorMap = gradient.generateColorMap(mOpacity);
    }

    public void setOpacity(double d)
    {
        mOpacity = d;
        setGradient(mGradient);
    }

    public void setRadius(int i)
    {
        mRadius = i;
        mKernel = generateKernel(mRadius, (double)mRadius / 3D);
        mMaxIntensity = getMaxIntensities(mRadius);
    }

    public void setWeightedData(Collection collection)
    {
        mData = collection;
        if (mData.isEmpty())
        {
            throw new IllegalArgumentException("No input points.");
        }
        mBounds = getBounds(mData);
        mTree = new PointQuadTree(mBounds);
        WeightedLatLng weightedlatlng;
        for (collection = mData.iterator(); collection.hasNext(); mTree.add(weightedlatlng))
        {
            weightedlatlng = (WeightedLatLng)collection.next();
        }

        mMaxIntensity = getMaxIntensities(mRadius);
    }


}
