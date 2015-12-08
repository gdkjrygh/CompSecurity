// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.internal.zzky;
import com.google.android.gms.internal.zzlh;
import com.google.android.gms.internal.zzli;
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
        private final int zzCY;
        protected final int zzabG;
        protected final boolean zzabH;
        protected final int zzabI;
        protected final boolean zzabJ;
        protected final String zzabK;
        protected final int zzabL;
        protected final Class zzabM;
        protected final String zzabN;
        private FieldMappingDictionary zzabO;
        private zza zzabP;

        public static Field zza(String s, int i, zza zza1, boolean flag)
        {
            return new Field(zza1.zzok(), flag, zza1.zzol(), false, s, i, null, zza1);
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
            return field.zzabP;
        }

        public static Field zzi(String s, int i)
        {
            return new Field(0, false, 0, false, s, i, null, null);
        }

        public static Field zzj(String s, int i)
        {
            return new Field(4, false, 4, false, s, i, null, null);
        }

        public static Field zzk(String s, int i)
        {
            return new Field(6, false, 6, false, s, i, null, null);
        }

        public static Field zzl(String s, int i)
        {
            return new Field(7, false, 7, false, s, i, null, null);
        }

        public static Field zzm(String s, int i)
        {
            return new Field(7, true, 7, true, s, i, null, null);
        }

        public Object convertBack(Object obj)
        {
            return zzabP.convertBack(obj);
        }

        public int describeContents()
        {
            com.google.android.gms.common.server.response.zza zza1 = CREATOR;
            return 0;
        }

        public int getVersionCode()
        {
            return zzCY;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("Field\n");
            stringbuilder.append("            versionCode=").append(zzCY).append('\n');
            stringbuilder.append("                 typeIn=").append(zzabG).append('\n');
            stringbuilder.append("            typeInArray=").append(zzabH).append('\n');
            stringbuilder.append("                typeOut=").append(zzabI).append('\n');
            stringbuilder.append("           typeOutArray=").append(zzabJ).append('\n');
            stringbuilder.append("        outputFieldName=").append(zzabK).append('\n');
            stringbuilder.append("      safeParcelFieldId=").append(zzabL).append('\n');
            stringbuilder.append("       concreteTypeName=").append(zzov()).append('\n');
            if (zzou() != null)
            {
                stringbuilder.append("     concreteType.class=").append(zzou().getCanonicalName()).append('\n');
            }
            StringBuilder stringbuilder1 = stringbuilder.append("          converterName=");
            String s;
            if (zzabP == null)
            {
                s = "null";
            } else
            {
                s = zzabP.getClass().getCanonicalName();
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
            zzabO = fieldmappingdictionary;
        }

        public int zzok()
        {
            return zzabG;
        }

        public int zzol()
        {
            return zzabI;
        }

        public Field zzop()
        {
            return new Field(zzCY, zzabG, zzabH, zzabI, zzabJ, zzabK, zzabL, zzabN, zzox());
        }

        public boolean zzoq()
        {
            return zzabH;
        }

        public boolean zzor()
        {
            return zzabJ;
        }

        public String zzos()
        {
            return zzabK;
        }

        public int zzot()
        {
            return zzabL;
        }

        public Class zzou()
        {
            return zzabM;
        }

        String zzov()
        {
            if (zzabN == null)
            {
                return null;
            } else
            {
                return zzabN;
            }
        }

        public boolean zzow()
        {
            return zzabP != null;
        }

        ConverterWrapper zzox()
        {
            if (zzabP == null)
            {
                return null;
            } else
            {
                return ConverterWrapper.zza(zzabP);
            }
        }

        public Map zzoy()
        {
            zzu.zzu(zzabN);
            zzu.zzu(zzabO);
            return zzabO.zzco(zzabN);
        }


        Field(int i, int j, boolean flag, int k, boolean flag1, String s, int l, 
                String s1, ConverterWrapper converterwrapper)
        {
            zzCY = i;
            zzabG = j;
            zzabH = flag;
            zzabI = k;
            zzabJ = flag1;
            zzabK = s;
            zzabL = l;
            if (s1 == null)
            {
                zzabM = null;
                zzabN = null;
            } else
            {
                zzabM = com/google/android/gms/common/server/response/SafeParcelResponse;
                zzabN = s1;
            }
            if (converterwrapper == null)
            {
                zzabP = null;
                return;
            } else
            {
                zzabP = converterwrapper.zzoi();
                return;
            }
        }

        protected Field(int i, boolean flag, int j, boolean flag1, String s, int k, Class class1, 
                zza zza1)
        {
            zzCY = 1;
            zzabG = i;
            zzabH = flag;
            zzabI = j;
            zzabJ = flag1;
            zzabK = s;
            zzabL = k;
            zzabM = class1;
            if (class1 == null)
            {
                zzabN = null;
            } else
            {
                zzabN = class1.getCanonicalName();
            }
            zzabP = zza1;
        }
    }

    public static interface zza
    {

        public abstract Object convertBack(Object obj);

        public abstract int zzok();

        public abstract int zzol();
    }


    public FastJsonResponse()
    {
    }

    private void zza(StringBuilder stringbuilder, Field field, Object obj)
    {
        if (field.zzok() == 11)
        {
            stringbuilder.append(((FastJsonResponse)field.zzou().cast(obj)).toString());
            return;
        }
        if (field.zzok() == 7)
        {
            stringbuilder.append("\"");
            stringbuilder.append(zzlh.zzcr((String)obj));
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
        Map map = zzom();
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
                        switch (field.zzol())
                        {
                        default:
                            if (field.zzoq())
                            {
                                zza(stringbuilder, field, (ArrayList)obj);
                            } else
                            {
                                zza(stringbuilder, field, obj);
                            }
                            break;

                        case 8: // '\b'
                            stringbuilder.append("\"").append(zzky.zzi((byte[])(byte[])obj)).append("\"");
                            break;

                        case 9: // '\t'
                            stringbuilder.append("\"").append(zzky.zzj((byte[])(byte[])obj)).append("\"");
                            break;

                        case 10: // '\n'
                            zzli.zza(stringbuilder, (HashMap)obj);
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
        if (field.zzol() == 11)
        {
            if (field.zzor())
            {
                return zzcn(field.zzos());
            } else
            {
                return zzcm(field.zzos());
            }
        } else
        {
            return zzcl(field.zzos());
        }
    }

    protected Object zzb(Field field)
    {
        String s = field.zzos();
        if (field.zzou() != null)
        {
            boolean flag;
            if (zzck(field.zzos()) == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zza(flag, "Concrete field shouldn't be value object: %s", new Object[] {
                field.zzos()
            });
            if (field.zzor())
            {
                field = zzoo();
            } else
            {
                field = zzon();
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
            return zzck(field.zzos());
        }
    }

    protected abstract Object zzck(String s);

    protected abstract boolean zzcl(String s);

    protected boolean zzcm(String s)
    {
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    protected boolean zzcn(String s)
    {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
    }

    public abstract Map zzom();

    public HashMap zzon()
    {
        return null;
    }

    public HashMap zzoo()
    {
        return null;
    }
}
