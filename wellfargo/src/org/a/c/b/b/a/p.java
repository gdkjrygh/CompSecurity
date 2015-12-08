// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.b.a;


// Referenced classes of package org.a.c.b.b.a:
//            k, o, e, f, 
//            i

public interface p
    extends k, o
{

    public static final e aA_ = new e("Orientation", 274, S_, 1, fR);
    public static final e aB_ = new e("Samples Per Pixel", 277, S_, 1, fR);
    public static final e aC_ = new e("Rows Per Strip", 278, T_, 1, fR);
    public static final e aD_ = new e("Strip Byte Counts", 279, gi, -1, fR);
    public static final e aE_ = new e("Min Sample Value", 280, S_, -1, fR);
    public static final e aF_ = new e("Max Sample Value", 281, S_, -1, fR);
    public static final e aG_ = new e("XResolution", 282, gj, 1, fR);
    public static final e aH_ = new e("YResolution", 283, gj, 1, fR);
    public static final e aI_ = new e("Planar Configuration", 284, S_, 1, fR);
    public static final e aJ[] = {
        au_, av_, aw_, ax_, ay_, q, r, s, t, u, 
        v, w, x, y, z, az_, aA_, aB_, aC_, aD_, 
        aE_, aF_, aG_, aH_, aI_, aJ_, aK_, aL_, aM_, aN_, 
        aO_, aP_, aQ_, aR_, aS_, aT_, aU_, aV_, aW_, aX_, 
        aY_, aZ_, ba_, bb_, bc_, bd_, be_, bf_, bg_, bh_, 
        bi_, bj_, bk_, bl_, bm_, bn_, bo_, aq, ar, as, 
        at, au, av, aw, ax, ay, az, bp_, bq_, br_, 
        bs_, bt_, bu_, bv_, bw_
    };
    public static final e aJ_ = new e("Page Name", 285, gh, -1, fR);
    public static final e aK_ = new e("XPosition", 286, gj, -1, fR);
    public static final e aL_ = new e("YPosition", 287, gj, -1, fR);
    public static final e aM_ = new e("Free Offsets", 288, R_, -1, fR);
    public static final e aN_ = new e("Free Byte Counts", 289, R_, -1, fR);
    public static final e aO_ = new e("Gray Response Unit", 290, S_, 1, fR);
    public static final e aP_ = new e("Gray Response Curve", 291, S_, -1, fR);
    public static final e aQ_ = new e("T4 Options", 292, R_, 1, fR);
    public static final e aR_ = new e("T6 Options", 293, R_, 1, fR);
    public static final e aS_ = new e("Resolution Unit", 296, S_, 1, fR);
    public static final e aT_ = new e("Page Number", 297, S_, 2, fR);
    public static final e aU_ = new e("Transfer Function", 301, S_, -1, fR);
    public static final e aV_ = new e("Software", 305, gh, -1, fR);
    public static final e aW_ = new e("Date Time", 306, gh, 20, fR);
    public static final e aX_ = new e("Artist", 315, gh, -1, fR);
    public static final e aY_ = new e("Host Computer", 316, gh, -1, fR);
    public static final e aZ_ = new e("Predictor", 317, S_, 1, fR);
    public static final e aq = new e("SMin Sample Value", 340, gm, -1, fR);
    public static final e ar = new e("SMax Sample Value", 341, gm, -1, fR);
    public static final e as = new e("Transfer Range", 342, S_, 6, fR);
    public static final e at = new e("JPEGProc", 512, S_, 1, fR);
    public static final e au = new f("JPEGInterchange Format", 513, R_, 1, fR);
    public static final e au_ = new e("New Subfile Type", 254, R_, 1, fR);
    public static final e av = new e("JPEGInterchange Format Length", 514, R_, 1, fR);
    public static final e av_ = new e("Subfile Type", 255, S_, 1, fR);
    public static final e aw = new e("JPEGRestart Interval", 515, S_, 1, fR);
    public static final e aw_ = new e("Image Width", 256, T_, 1, fR);
    public static final e ax = new e("JPEGLossless Predictors", 517, S_, -1, fR);
    public static final e ax_ = new e("Image Length", 257, T_, 1, fR);
    public static final e ay = new e("JPEGPoint Transforms", 518, S_, -1, fR);
    public static final e ay_ = new e("Bits Per Sample", 258, S_, -1, fR);
    public static final e az = new e("JPEGQTables", 519, R_, -1, fR);
    public static final e az_ = new f("Strip Offsets", 273, T_, -1, fR);
    public static final e ba_ = new e("White Point", 318, gj, 2, fR);
    public static final e bb_ = new e("Primary Chromaticities", 319, gj, 6, fR);
    public static final e bc_ = new e("Color Map", 320, S_, -1, fR);
    public static final e bd_ = new e("Halftone Hints", 321, S_, 2, fR);
    public static final e be_ = new e("Tile Width", 322, T_, 1, fR);
    public static final e bf_ = new e("Tile Length", 323, T_, 1, fR);
    public static final e bg_ = new f("Tile Offsets", 324, R_, -1, fR);
    public static final e bh_ = new e("Tile Byte Counts", 325, T_, -1, fR);
    public static final e bi_ = new e("Ink Set", 332, S_, 1, fR);
    public static final e bj_ = new e("Ink Names", 333, gh, -1, fR);
    public static final e bk_ = new e("Number Of Inks", 334, S_, 1, fR);
    public static final e bl_ = new e("Dot Range", 336, gk, -1, fR);
    public static final e bm_ = new e("Target Printer", 337, gh, -1, fR);
    public static final e bn_ = new e("Extra Samples", 338, gl, -1, fR);
    public static final e bo_ = new e("Sample Format", 339, S_, -1, fR);
    public static final e bp_ = new e("JPEGDCTables", 520, R_, -1, fR);
    public static final e bq_ = new e("JPEGACTables", 521, R_, -1, fR);
    public static final e br_ = new e("YCbCr Coefficients", 529, gj, 3, fR);
    public static final e bs_ = new e("YCbCr Sub Sampling", 530, S_, 2, fR);
    public static final e bt_ = new e("YCbCr Positioning", 531, S_, 1, fR);
    public static final e bu_ = new e("Reference Black White", 532, R_, -1, fR);
    public static final e bv_ = new e("Copyright", 33432, gh, -1, fR);
    public static final e bw_ = new e("XMP", 700, gl, -1, fR);
    public static final e bx_ = new i("Unknown Tag", gn, gf);
    public static final e q = new e("Compression", 259, S_, 1, fR);
    public static final e r = new e("Photometric Interpretation", 262, S_, 1, fR);
    public static final e s = new e("Threshholding", 263, S_, 1, fR);
    public static final e t = new e("Cell Width", 264, S_, 1, fR);
    public static final e u = new e("Cell Length", 265, S_, 1, fR);
    public static final e v = new e("Fill Order", 266, S_, 1, fR);
    public static final e w = new e("Document Name", 269, gh, -1, fR);
    public static final e x = new e("Image Description", 270, gh, -1, fR);
    public static final e y = new e("Make", 271, gh, -1, fR);
    public static final e z = new e("Model", 272, gh, -1, fR);

}
