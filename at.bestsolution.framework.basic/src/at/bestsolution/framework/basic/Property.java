package at.bestsolution.framework.basic;

public interface Property<T> {
	public void set(T value);
	public T get();
	public void dispose();

	public void addChangeListener(ChangeListener<T> listener);
	public void removeChangeListener(ChangeListener<T> listener);

	public interface ChangeListener<T> {
		public void valueChanged(Property<T> property, T oldValue, T newValue );
	}
}
