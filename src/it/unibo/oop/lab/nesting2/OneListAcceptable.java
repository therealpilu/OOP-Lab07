package it.unibo.oop.lab.nesting2;

import java.util.Iterator;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {
	
	private final List<T> list;
	
	/**
	 * 
	 * @param list
	 * 				the list of elements representing the right sequence 
	 * 				to be accepted
	 */
	public OneListAcceptable(final List<T> list) {
		this.list = list;
	}

	@Override
	public Acceptor<T> acceptor() {
		final Iterator<T> iterator = list.iterator();
		return new Acceptor<T>() {

			@Override
			public void accept(final T newElement) throws Acceptor.ElementNotAcceptedException {
				try {
					if (newElement.equals(iterator.next())) {
						return;
					}
				} catch (Exception e) {
					System.out.println("No more elements to be evaluated.");
				}
				throw new Acceptor.ElementNotAcceptedException(newElement);
			}

			@Override
			public void end() throws Acceptor.EndNotAcceptedException {
				try {
					if (!iterator.hasNext()) {
						return;
					}
				} catch (Exception e) {
					System.out.println("2" + e.getMessage());
				}
				throw new Acceptor.EndNotAcceptedException();
			}
			
		};
	}

}
