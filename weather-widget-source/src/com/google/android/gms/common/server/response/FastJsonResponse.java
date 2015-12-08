// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.internal.zzlj;
import com.google.android.gms.internal.zzls;
import com.google.android.gms.internal.zzlt;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.server.response:
//            zza, SafeParcelResponse, FieldMappingDictionary

public abstract class FastJsonResponse
{
    public static class Field
        implements SafeParcelable
    {

        public static final com.google.android.gms.common.server.response.zza CREATOR = new com.google.android.gms.common.server.response.zza();
        private final int mVersionCode;
        protected final int zzaeQ;
        protected final boolean zzaeR;
        protected final int zzaeS;
        protected final boolean zzaeT;
        protected final String zzaeU;
        protected final int zzaeV;
        protected final Class zzaeW;
        protected final String zzaeX;
        private FieldMappingDictionary zzaeY;
        private zza zzaeZ;

        public static Field zza(String s, int i, zza zza1, boolean flag)
        {
            return new Field(zza1.zzoZ(), flag, zza1.zzpa(), false, s, i, null, zza1);
        }

        public static Field zza(String s, int i, Class class1)
        {
            return new Field(11, false, 11, false, s, i, class1, null);
        }

        public static Field zzb(String s, int i, Class class1)
        {
            return new Field(11, true, 11, true, s, i, class1, null);
        }

        static zza zzc(Field field)
        {
            return field.zzaeZ;
        }

        public static Field zzj(String s, int i)
        {
            return new Field(0, false, 0, false, s, i, null, null);
        }

        public static Field zzk(String s, int i)
        {
            return new Field(4, false, 4, false, s, i, null, null);
        }

        public static Field zzl(String s, int i)
        {
            return new Field(6, false, 6, false, s, i, null, null);
        }

        public static Field zzm(String s, int i)
        {
            return new Field(7, false, 7, false, s, i, null, null);
        }

        public static Field zzn(String s, int i)
        {
            return new Field(7, true, 7, true, s, i, null, null);
        }

        public Object convertBack(Object obj)
        {
            return zzaeZ.convertBack(obj);
        }

        public int describeContents()
        {
            com.google.android.gms.common.server.response.zza zza1 = CREATOR;
            return 0;
        }

        public int getVersionCode()
        {
            return mVersionCode;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("Field\n");
            stringbuilder.append("            versionCode=").append(mVersionCode).append('\n');
            stringbuilder.append("                 typeIn=").append(zzaeQ).append('\n');
            stringbuilder.append("            typeInArray=").append(zzaeR).append('\n');
            stringbuilder.append("                typeOut=").append(zzaeS).append('\n');
            stringbuilder.append("           typeOutArray=").append(zzaeT).append('\n');
            stringbuilder.append("        outputFieldName=").append(zzaeU).append('\n');
            stringbuilder.append("      safeParcelFieldId=").append(zzaeV).append('\n');
            stringbuilder.append("       concreteTypeName=").append(zzpk()).append('\n');
            if (zzpj() != null)
            {
                stringbuilder.append("     concreteType.class=").append(zzpj().getCanonicalName()).append('\n');
            }
            StringBuilder stringbuilder1 = stringbuilder.append("          converterName=");
            String s;
            if (zzaeZ == null)
            {
                s = "null";
            } else
            {
                s = zzaeZ.getClass().getCanonicalName();
            }
            stringbuilder1.append(s).append('\n');
            return stringbuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            com.google.android.gms.common.server.response.zza zza1 = CREATOR;
            com.google.android.gms.common.server.response.zza.zza(this, parcel, i);
        }

        public void zza(FieldMappingDictionary fieldmappingdictionary)
        {
            zzaeY = fieldmappingdictionary;
        }

        public int zzoZ()
        {
            return zzaeQ;
        }

        public int zzpa()
        {
            return zzaeS;
        }

        public Field zzpe()
        {
            return new Field(mVersionCode, zzaeQ, zzaeR, zzaeS, zzaeT, zzaeU, zzaeV, zzaeX, zzpm());
        }

        public boolean zzpf()
        {
            return zzaeR;
        }

        public boolean zzpg()
        {
            return zzaeT;
        }

        public String zzph()
        {
            return zzaeU;
        }

        public int zzpi()
        {
            return zzaeV;
        }

        public Class zzpj()
        {
            return zzaeW;
        }

        String zzpk()
        {
            if (zzaeX == null)
            {
                return null;
            } else
            {
                return zzaeX;
            }
        }

        public boolean zzpl()
        {
            return zzaeZ != null;
        }

        ConverterWrapper zzpm()
        {
            if (zzaeZ == null)
            {
                return null;
            } else
            {
                return ConverterWrapper.zza(zzaeZ);
            }
        }

        public Map zzpn()
        {
            zzx.zzv(zzaeX);
            zzx.zzv(zzaeY);
            return zzaeY.zzcx(zzaeX);
        }


        Field(int i, int j, boolean flag, int k, boolean flag1, String s, int l, 
                String s1, ConverterWrapper converterwrapper)
        {
            mVersionCode = i;
            zzaeQ = j;
            zzaeR = flag;
            zzaeS = k;
            zzaeT = flag1;
            zzaeU = s;
            zzaeV = l;
            if (s1 == null)
            {
                zzaeW = null;
                zzaeX = null;
            } else
            {
                zzaeW = com/google/android/gms/common/server/response/SafeParcelResponse;
                zzaeX = s1;
            }
            if (converterwrapper == null)
            {
                zzaeZ = null;
                return;
            } else
            {
                zzaeZ = converterwrapper.zzoX();
                return;
            }
        }

        protected Field(int i, boolean flag, int j, boolean flag1, String s, int k, Class class1, 
                zza zza1)
        {
            mVersionCode = 1;
            zzaeQ = i;
            zzaeR = flag;
            zzaeS = j;
            zzaeT = flag1;
            zzaeU = s;
            zzaeV = k;
            zzaeW = class1;
            if (class1 == null)
            {
                zzaeX = null;
            } else
            {
                zzaeX = class1.getCanonicalName();
            }
            zzaeZ = zza1;
        }
    }

    public static interface zza
    {

        public abstract Object convertBack(Object obj);

        public abstract int zzoZ();

        public abstract int zzpa();
    }


    public FastJsonResponse()
    {
    }

    private void zza(StringBuilder stringbuilder, Field field, Object obj)
    {
        if (field.zzoZ() == 11)
        {
            stringbuilder.append(((FastJsonResponse)field.zzpj().cast(obj)).toString());
            return;
        }
        if (field.zzoZ() == 7)
        {
            stringbuilder.append("\"");
            stringbuilder.append(zzls.zzcA((String)obj));
            stringbuilder.append("\"");
            return;
        } else
        {
            stringbuilder.append(obj);
            return;
        }
    }

    private void zza(StringBuilder stringbuilder, Field field, ArrayList arraylist)
    {
        stringbuilder.append("[");
        int i = 0;
        for (int j = arraylist.size(); i < j; i++)
        {
            if (i > 0)
            {
                stringbuilder.append(",");
            }
            Object obj = arraylist.get(i);
            if (obj != null)
            {
                zza(stringbuilder, field, obj);
            }
        }

        stringbuilder.append("]");
    }

    public String toString()
    {
        Map map = zzpb();
        StringBuilder stringbuilder = new StringBuilder(100);
        Iterator iterator = map.keySet().iterator();
label0:
        do
        {
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s = (String)iterator.next();
                Field field = (Field)map.get(s);
                if (zza(field))
                {
                    Object obj = zza(field, zzb(field));
                    if (stringbuilder.length() == 0)
                    {
                        stringbuilder.append("{");
                    } else
                    {
                        stringbuilder.append(",");
                    }
                    stringbuilder.append("\"").append(s).append("\":");
                    if (obj == null)
                    {
                        stringbuilder.append("null");
                    } else
                    {
                        switch (field.zzpa())
                        {
                        default:
                            if (field.zzpf())
                            {
                                zza(stringbuilder, field, (ArrayList)obj);
                            } else
                            {
                                zza(stringbuilder, field, obj);
                            }
                            break;

                        case 8: // '\b'
                            stringbuilder.append("\"").append(zzlj.zzi((byte[])(byte[])obj)).append("\"");
                            break;

                        case 9: // '\t'
                            stringbuilder.append("\"").append(zzlj.zzj((byte[])(byte[])obj)).append("\"");
                            break;

                        case 10: // '\n'
                            zzlt.zza(stringbuilder, (HashMap)obj);
                            break;
                        }
                        continue label0;
                    }
                }
            } while (true);
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append("}");
            } else
            {
                stringbuilder.append("{}");
            }
            return stringbuilder.toString();
        } while (true);
    }

    protected Object zza(Field field, Object obj)
    {
        Object obj1 = obj;
        if (Field.zzc(field) != null)
        {
            obj1 = field.convertBack(obj);
        }
        return obj1;
    }

    protected boolean zza(Field field)
    {
        if (field.zzpa() == 11)
        {
            if (field.zzpg())
            {
                return zzcw(field.zzph());
            } else
            {
                return zzcv(field.zzph());
            }
        } else
        {
            return zzcu(field.zzph());
        }
    }

    protected Object zzb(Field field)
    {
        String s = field.zzph();
        if (field.zzpj() != null)
        {
            boolean flag;
            if (zzct(field.zzph()) == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzx.zza(flag, "Concrete field shouldn't be value object: %s", new Object[] {
                field.zzph()
            });
            if (field.zzpg())
            {
                field = zzpd();
            } else
            {
                field = zzpc();
            }
            if (field != null)
            {
                return field.get(s);
            }
            try
            {
                field = (new StringBuilder()).append("get").append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
                field = ((Field) (getClass().getMethod(field, new Class[0]).invoke(this, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (Field field)
            {
                throw new RuntimeException(field);
            }
            return field;
        } else
        {
            return zzct(field.zzph());
        }
    }

    protected abstract Object zzct(String s);

    protected abstract boolean zzcu(String s);

    protected boolean zzcv(String s)
    {
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    protected boolean zzcw(String s)
    {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
    }

    public abstract Map zzpb();

    public HashMap zzpc()
    {
        return null;
    }

    public HashMap zzpd()
    {
        return null;
    }
}
