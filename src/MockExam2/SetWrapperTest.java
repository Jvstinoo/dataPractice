package MockExam2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetWrapperTest {

	//Failed to return true on sets = [{Joe}, {Ned}, {Amy, Pol}], B = {Joe, Ned, Amy, Pol}

	SetWrapper.Set<String> B = new SetWrapper.ArraySet<String>();

	SetWrapper.Set<String> s1 = new SetWrapper.ArraySet<String>();
	SetWrapper.Set<String> s2 = new SetWrapper.ArraySet<String>();
	SetWrapper.Set<String> s3 = new SetWrapper.ArraySet<String>();

	
	@BeforeEach
	void setUp() throws Exception {
		s1.add("Joe");
		s2.add("Ned");
		s3.add("Amy");
		s3.add("Pol");
		
		B.add("Joe");
		B.add("Ned");
		B.add("Amy");
		B.add("Pol");
	}

	@Test
	void test() {
		SetWrapper.List<SetWrapper.Set<String>> ls = new SetWrapper.LinkedList<SetWrapper.Set<String>>();
		ls.add(s1);
		ls.add(s2);
		ls.add(s3);
		
		SetWrapper.isPartition(ls, B);
		assertTrue(SetWrapper.isPartition(ls, B));
	}

}
