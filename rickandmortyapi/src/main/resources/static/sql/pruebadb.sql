INSERT INTO public."location"
(id, created_at, dimension, "name", "type", url)
VALUES(1, now(), 'Replacemt Dimension', 'Earth', 'Planet', 'https://reckandmortyapi.com/earth');

INSERT INTO public."character"
(id, created_at, gender, image, "name", species, status, "type", url, location_id, origin_id)
VALUES(1, now(), 'Male', 'https://reckandmortyapi.com/character/1.jpeg', 'Rick Sanchez', 'Human', 'true', 'a', 'https://reckandmortyapi.com/character/1', 1, 1);

INSERT INTO public."character"
(id, created_at, gender, image, "name", species, status, "type", url, location_id, origin_id)
VALUES(2, now(), 'Male', 'https://reckandmortyapi.com/character/2.jpeg', 'Morty Smit', 'Human', 'true', 'a', 'https://reckandmortyapi.com/character/2', 1, 1);

INSERT INTO public.episode
(id, created_at, air_date, "name", url)
VALUES(1, now(), now(), 'The Ricklantis Mixup', 'https://reckandmortyapi.com/episode/1');

INSERT INTO public.character_episode<
(character_model_id, episode_id)
VALUES(1, 1);

INSERT INTO public.character_episode
(character_model_id, episode_id)
VALUES(2, 1);

INSERT INTO public.episode_episode
(episode_model_id, episode_id)
VALUES(1, 1);

INSERT INTO public.episode_characters
(episode_model_id, characters_id)
VALUES(1, 1);

INSERT INTO public.episode_characters
(episode_model_id, characters_id)
VALUES(1, 2);
