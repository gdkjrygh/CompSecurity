.class Lcom/mixpanel/android/mpmetrics/InAppFragment$SineBounceInterpolator;
.super Ljava/lang/Object;
.source "InAppFragment.java"

# interfaces
.implements Landroid/view/animation/Interpolator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/mpmetrics/InAppFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "SineBounceInterpolator"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mixpanel/android/mpmetrics/InAppFragment;


# direct methods
.method public constructor <init>(Lcom/mixpanel/android/mpmetrics/InAppFragment;)V
    .locals 0

    .prologue
    .line 244
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/InAppFragment$SineBounceInterpolator;->this$0:Lcom/mixpanel/android/mpmetrics/InAppFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getInterpolation(F)F
    .locals 4
    .param p1, "t"    # F

    .prologue
    .line 246
    const-wide v0, 0x4005bf0a8b145769L    # Math.E

    const/high16 v2, -0x3f000000    # -8.0f

    mul-float/2addr v2, p1

    float-to-double v2, v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    const/high16 v2, 0x41400000    # 12.0f

    mul-float/2addr v2, p1

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    mul-double/2addr v0, v2

    neg-double v0, v0

    double-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr v0, v1

    return v0
.end method
