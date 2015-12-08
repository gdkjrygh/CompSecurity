.class Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;
.super Ljava/lang/Object;
.source "ViewSnapshot.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/viewcrawler/ViewSnapshot;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "RootViewInfo"
.end annotation


# instance fields
.field public final activityName:Ljava/lang/String;

.field public final rootView:Landroid/view/View;

.field public scale:F

.field public screenshot:Lcom/mixpanel/android/viewcrawler/ViewSnapshot$CachedBitmap;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/view/View;)V
    .locals 1
    .param p1, "activityName"    # Ljava/lang/String;
    .param p2, "rootView"    # Landroid/view/View;

    .prologue
    .line 438
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 439
    iput-object p1, p0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;->activityName:Ljava/lang/String;

    .line 440
    iput-object p2, p0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;->rootView:Landroid/view/View;

    .line 441
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;->screenshot:Lcom/mixpanel/android/viewcrawler/ViewSnapshot$CachedBitmap;

    .line 442
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;->scale:F

    .line 443
    return-void
.end method
