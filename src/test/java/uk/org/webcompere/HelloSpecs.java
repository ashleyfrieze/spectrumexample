package uk.org.webcompere;

import static com.greghaskins.spectrum.Spectrum.describe;
import static com.greghaskins.spectrum.Spectrum.it;
import static org.junit.Assert.assertEquals;
import static uk.org.webcompere.Hello.helloWorlder;

import com.greghaskins.spectrum.Spectrum;
import org.junit.runner.RunWith;

@RunWith(Spectrum.class)
public class HelloSpecs {
	{
		describe("Hello worlder", () -> {
			it("says hello world", () -> {
				assertEquals("Hello world!", helloWorlder("world"));
			});

			it("says hello to other stuff too", () -> {
				assertEquals("Hello goat!", helloWorlder("goat"));
			});
		});
	}
}
