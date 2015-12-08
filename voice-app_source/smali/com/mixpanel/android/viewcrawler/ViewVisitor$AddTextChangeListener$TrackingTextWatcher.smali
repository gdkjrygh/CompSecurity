.class Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddTextChangeListener$TrackingTextWatcher;
.super Ljava/lang/Object;
.source "ViewVisitor.java"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddTextChangeListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "TrackingTextWatcher"
.end annotation


# instance fields
.field private final mBoundTo:Landroid/view/View;

.field final synthetic this$1:Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddTextChangeListener;


# direct methods
.method public constructor <init>(Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddTextChangeListener;Landroid/view/View;)V
    .locals 0
    .param p2, "boundTo"    # Landroid/view/View;

    .prologue
    .line 509
    iput-object p1, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddTextChangeListener$TrackingTextWatcher;->this$1:Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddTextChangeListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 510
    iput-object p2, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddTextChangeListener$TrackingTextWatcher;->mBoundTo:Landroid/view/View;

    .line 511
    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 2
    .param p1, "s"    # Landroid/text/Editable;

    .prologue
    .line 525
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddTextChangeListener$TrackingTextWatcher;->this$1:Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddTextChangeListener;

    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddTextChangeListener$TrackingTextWatcher;->mBoundTo:Landroid/view/View;

    invoke-virtual {v0, v1}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddTextChangeListener;->fireEvent(Landroid/view/View;)V

    .line 526
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0
    .param p1, "s"    # Ljava/lang/CharSequence;
    .param p2, "start"    # I
    .param p3, "count"    # I
    .param p4, "after"    # I

    .prologue
    .line 516
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0
    .param p1, "s"    # Ljava/lang/CharSequence;
    .param p2, "start"    # I
    .param p3, "before"    # I
    .param p4, "count"    # I

    .prologue
    .line 521
    return-void
.end method
