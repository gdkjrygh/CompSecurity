.class public Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutRule;
.super Ljava/lang/Object;
.source "ViewVisitor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/viewcrawler/ViewVisitor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LayoutRule"
.end annotation


# instance fields
.field public final anchor:I

.field public final verb:I

.field public final viewId:I


# direct methods
.method public constructor <init>(III)V
    .locals 0
    .param p1, "vi"    # I
    .param p2, "v"    # I
    .param p3, "a"    # I

    .prologue
    .line 343
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 344
    iput p1, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutRule;->viewId:I

    .line 345
    iput p2, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutRule;->verb:I

    .line 346
    iput p3, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutRule;->anchor:I

    .line 347
    return-void
.end method
