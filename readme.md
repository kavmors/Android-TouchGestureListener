# **Android-TouchGestureListener** #

Implement of OnTouchListener that can detect more events after a touch of singleTap, doubleTap and multiTap.

## **Usage** ##

See DemoActivity and source.

## **Interface** ##

	public interface OnDetectSingle {
		public void onDown(PointF point);
		public void onMove(PointF from, PointF to, float dx, float dy);
		public void onFling(PointF from, PointF to, float vx, float vy);
		public void onUp(PointF point);
		public void onClick(PointF point);
		public void onLongClick(PointF point);
	}

	public interface OnDetectDouble {
		public void onDblDown(PointF point);
		public void onDblMove(PointF from, PointF to, float dx, float dy);
		public void onDblUp(PointF point);
		public void onDblClick(PointF point);
		public void onDblLongClick(PointF point);
	}
	
	public interface OnDetectMulti {
		public void onMultiDown(PointF p0, PointF p1);
		public void onMultiMove(PointF oldPoint0, PointF oldPoint1, PointF newPoint0, PointF newPoint1);
		public void onMultiUp(PointF p0, PointF p1);
		public void onMultiClick(PointF p0, PointF p1);
		public void onMultiLongClick(PointF p0, PointF p1);
	}

## **Method** ##

	public void setOnDetectSingle(OnDetectSingle listener)
	public void setOnDetectDouble(OnDetectDouble listener)
	public void setOnDetectMulti(OnDetectMulti listener)
	public void setLongClickable(boolean longClickable)
	public void setDblLongClickable(boolean dblLongClickable)
	public void setMultiLongClickable(boolean multiLongClickable)