package uk.org.webcompere;

import static com.greghaskins.spectrum.dsl.gherkin.Gherkin.*;
import static org.junit.Assert.assertEquals;
import static uk.org.webcompere.Hello.helloWorlder;

import com.greghaskins.spectrum.Spectrum;
import org.junit.runner.RunWith;

@RunWith(Spectrum.class)
public class HelloBDDSpecs {
	{
		feature("Hello world", () -> {
			scenarioOutline("worlder", (input, expected) -> {
				// note: there must aways be a given/when or then
				then("correct answer", () -> {
					assertEquals(expected, helloWorlder(input));
				});
			}, withExamples(
				example("world", "Hello world!"),
				example("giant", "Hello giant!")
			));
		});
	}
}
